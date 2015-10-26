package src;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dice {
    private JFrame frame=new JFrame(),parent;
    private JPanel panel;
    private ImageIcon[] images=new ImageIcon[6];
    private JButton menu;
    private int picture1=0,picture2=0;
    public Dice(JFrame parentFrame)
    {
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
                g.drawImage(images[picture1].getImage(),0,0,null);
                g.drawImage(images[picture2].getImage(),88,0,null);
                repaint();
            }
        };
        panel.setBounds(5,5,88*2,88);
        frame.add(panel);
        frame.add(menu);
        frame.setVisible(false);
    }
    public void show(boolean tf)
    {
        frame.setVisible(tf);
    }
}
