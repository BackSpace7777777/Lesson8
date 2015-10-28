package src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private int picture1=0,picture2=0,money=100,rolls=0;
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
        roll=new JButton();
        roll.setText("Roll");
        roll.setBounds(5,5+88*2,150,30);
        roll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(canUseThread)
                {
                    threadReset();
                    diceSelection.start();
                    rolls++;
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
        frame.add(roll);
        frame.add(panel);
        frame.add(menu);
        frame.setVisible(false);
    }
    private void threadReset()
    {
        diceSelection=new Thread(new Runnable() {
            public void run() {
                doneRoll=false;
                canUseThread=false;
                Random r=new Random();
                int times=0,t2=1;
                while(times<75 || times>150)
                {
                    times=r.nextInt(150-75)+75;
                }
                while(times>0)
                {
                    picture1=r.nextInt(6);
                    picture2=r.nextInt(6);
                    c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
                    times--;
                    if(times<15)t2+=30;
                    try {
                        Thread.sleep(50+t2);
                    } catch (InterruptedException ex) {}
                }
                doneRoll=true;
                if(rolls==1)
                {
                    if(picture1+1+picture2+1==7)
                    {
                        
                    }
                }
                else
                {
                    
                }
                canUseThread=true;
            }
        });
    }
    public void show(boolean tf)
    {
        frame.setVisible(tf);
    }
}
