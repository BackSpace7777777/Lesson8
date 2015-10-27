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
import javax.swing.JPanel;

public class Dice {
    private JFrame frame=new JFrame(),parent;
    private JPanel panel;
    private ImageIcon[] images=new ImageIcon[6];
    private JButton menu,roll;
    private int picture1=0,picture2=0;
    private boolean canUseThread=false;
    private Color c;
    private Thread diceSelection;
    public Dice(JFrame parentFrame)
    {
        threadReset();
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
                    diceSelection.start();
                else
                {
                    threadReset();
                    diceSelection.start();
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
                canUseThread=false;
                Random r=new Random();
                int times=0;
                while(times<75 || times>250)
                {
                    times=r.nextInt();
                }
                while(times>0)
                {
                    picture1=r.nextInt(6);
                    picture2=r.nextInt(6);
                    c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
                    times--;
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {}
                }
            }
        });
        canUseThread=true;
    }
    public void show(boolean tf)
    {
        frame.setVisible(tf);
    }
}
