package pl.Ghaneal.Trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    private JPanel panel, internalPanel;
    private JLabel text;
    private JButton ongoingButton, historyButton, startTrialButton, createTrialButton;

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

                ongoingButton = new JButton("Check");
                ongoingButton.setBounds(145, 5, 90, 25);
                internalPanel.add(ongoingButton);

                text = new JLabel("Trials History");
                text.setBounds(10, 35, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                historyButton = new JButton("Check");
                historyButton.setBounds(145, 35, 90, 25);
                internalPanel.add(historyButton);

                text = new JLabel("Start New Trials");
                text.setBounds(10, 65, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                startTrialButton = new JButton("Search");
                startTrialButton.setBounds(145, 65, 90, 25);
                internalPanel.add(startTrialButton);

                text = new JLabel("Create New Trial");
                text.setBounds(10, 95, 130, 25);
                text.setForeground(Color.white);
                internalPanel.add(text);

                createTrialButton = new JButton("Create");
                createTrialButton.setBounds(145, 95, 90, 25);
                internalPanel.add(createTrialButton);
                createTrialButton.addActionListener(this);
            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object source = actionEvent.getSource();

        if(source == createTrialButton){
            new NewTrailWindow().setVisible(true);
        }

    }
}
