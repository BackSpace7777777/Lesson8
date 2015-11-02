package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Dice {
    private JFrame frame=new JFrame(),parent;
    private JPanel panel;
    private ImageIcon[] images=new ImageIcon[6];
    private JButton menu,roll;
    private JLabel moneyL;
    private JTextArea out;
    private String text="";
    private int picture1=0,picture2=0,money=100,rolls=0,firstRollValue;
    private boolean canUseThread=false,doneRoll=false;
    private Color c;
    private Thread diceSelection;
    public Dice(JFrame parentFrame)
    {
        threadReset();
        canUseThread=true;
        images[0]=new ImageIcon(Dice.class.getResource("/src/Images/d1.jpg"));
        images[1]=new ImageIcon(Dice.class.getResource("/src/Images/d2.jpg"));
        images[2]=new ImageIcon(Dice.class.getResource("/src/Images/d3.jpg"));
        images[3]=new ImageIcon(Dice.class.getResource("/src/Images/d4.jpg"));
        images[4]=new ImageIcon(Dice.class.getResource("/src/Images/d5.jpg"));
        images[5]=new ImageIcon(Dice.class.getResource("/src/Images/d6.jpg"));
        parent=parentFrame;
        frame.setSize(300,300);
        frame.setTitle("Visual Craps");
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLayout(null);
        moneyL=new JLabel();
        moneyL.setText("You have $" + money);
        moneyL.setBounds(frame.getWidth()-100,frame.getHeight()-65,100,30);
        out=new JTextArea();
        out.setBounds(5,88+20,260,95);
        out.setEditable(false);
        roll=new JButton();
        roll.setText("Roll");
        roll.setBounds(5,frame.getHeight()-95,150,30);
        roll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(canUseThread)
                {
                    threadReset();
                    rolls++;
                    out.setText("");
                    if(money>4)
                    {
                        money-=5;
                        moneyL.setText("You have $" + money);
                        diceSelection.start();
                    }
                }
            }
        });
        menu=new JButton();
        menu.setText("Main Menu");
        menu.setBounds(5,frame.getHeight()-65,150,30);
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                show(false);
            }
        });
        panel=new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.clearRect(0,0,panel.getWidth(),panel.getHeight());
                g.setColor(c);
                g.fillRect(0,0,panel.getWidth(),panel.getHeight());
                g.drawImage(images[picture1].getImage(),0+5,0+5,null);
                g.drawImage(images[picture2].getImage(),88+5,0+5,null);
                repaint();
            }
        };
        panel.setBounds(0,0,88*2+10,88+10);
        frame.add(out);
        frame.add(moneyL);
        frame.add(roll);
        frame.add(panel);
        frame.add(menu);
        frame.setVisible(false);
    }
    private void threadReset()
    {
        diceSelection=new Thread(new Runnable() {
            public void run() {
                text="";
                doneRoll=false;
                canUseThread=false;
                Random r=new Random();
                int times=0,t2=1,p1t=r.nextInt(6),p2t=r.nextInt(6);
                while(times<75 || times>125)
                {
                    times=r.nextInt(125-75)+75;
                }
                while(times>0)
                {
                    while(picture1==p1t)
                        picture1=r.nextInt(6);
                    p1t=picture1;
                    while(picture2==p2t)
                        picture2=r.nextInt(6);
                    p2t=picture2;
                    c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
                    times--;
                    if(times<15)t2+=25;
                    try {
                        Thread.sleep(50+t2);
                    } catch (InterruptedException ex) {}
                }
                doneRoll=true;
                if(rolls==1)
                {
                    if((picture1+picture2+2==7) || (picture1+picture2+2==11))
                    {
                        text+="You have rolled a " + (picture1+picture2+2) + '\n';
                        text+="You have won!";
                        money=100;
                    }
                    else if((picture1+picture2+2==2)||(picture1+picture2+2==3)||(picture1+picture2+2==10))
                    {
                        text+="You have rolled a " + (picture1+picture2+2) + '\n';
                        text+="You have lost, try again?";
                        rolls=0;
                        money=100;
                    }
                    else
                    {
                        text+="Your winning number is " + (picture1+picture2+2);
                        firstRollValue=(picture1+picture2+2);
                    }
                }
                else
                {
                    if(picture1+picture2+2==7)
                    {
                        text+="You have rolled a " + (picture1+picture2+2) + '\n';
                        text+="You have lost, try again?";
                        rolls=0;
                        money=100;
                    }
                    else if(picture1+picture2+2==firstRollValue)
                    {
                        text+="You have rolled a " + firstRollValue + '\n';
                        text+="You have won!";
                        money+=15;
                    }
                    else
                    {
                        text+="You have rolled a " + (picture1+picture2+2) + '\n';
                        text+="You have won nothing, roll again";
                    }
                }
                out.setText(text);
                moneyL.setText("You have $" + money);
                canUseThread=true;
            }
        });
    }
    public void show(boolean tf)
    {
        frame.setVisible(tf);
    }
}
