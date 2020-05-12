package pl.Ghaneal.Trials;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel panel, internalPanel;
    private JLabel text;
    private JButton button;

    public MainWindow (){
        super ("30 Days Trials");
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setBounds(10, 70, 400, 600);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);{

            text = new JLabel("30 Days Trials");
            text.setBounds(10, 10, 390, 25);
            text.setHorizontalAlignment(JLabel.CENTER);
            panel.add(text);

            internalPanel = new JPanel();
            internalPanel.setLayout(null);
            internalPanel.setBounds(10, 45, 380, 125);
            internalPanel.setBackground(Color.blue);
            panel.add(internalPanel);{

                text = new JLabel("Ongoing Trials");
                text.setBounds(10, 5, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                button = new JButton("Check");
                button.setBounds(145, 5, 90, 25);
                internalPanel.add(button);

                text = new JLabel("Trials History");
                text.setBounds(10, 35, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                button = new JButton("Check");
                button.setBounds(145, 35, 90, 25);
                internalPanel.add(button);

                text = new JLabel("Start New Trials");
                text.setBounds(10, 65, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                button = new JButton("Search");
                button.setBounds(145, 65, 90, 25);
                internalPanel.add(button);

                text = new JLabel("Create New Trial");
                text.setBounds(10, 95, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                button = new JButton("Create");
                button.setBounds(145, 95, 90, 25);
                internalPanel.add(button);
            }
        }

    }


}
