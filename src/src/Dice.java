package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Dice {
    private JFrame frame=new JFrame();
    private JFrame parent;
    private JButton menu;
    public Dice(JFrame parentFrame)
    {
        parent=parentFrame;
        frame.setSize(640,640);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setLayout(null);
        menu=new JButton();
        menu.setText("Main Menu");
        menu.setBounds(5,5,150,30);
        menu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                show(false);
            }
        });
        frame.add(menu);
        frame.setVisible(true);
    }
    public void show(boolean tf)
    {
        frame.setVisible(tf);
    }
}
