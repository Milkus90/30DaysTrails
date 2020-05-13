package pl.Ghaneal.Trials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private JPanel panel, internalPanel;
    private JLabel label;
    private JButton ongoingButton, historyButton, startTrialButton, createTrialButton;

    public MainWindow() {
        super("30 Days Trials");
        setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        setBounds(10, 70, 400, 600);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        {

            label = new JLabel("30 Days Trials");
            label.setBounds(10, 10, 390, 25);
            label.setHorizontalAlignment(JLabel.CENTER);
            panel.add(label);

            internalPanel = new JPanel();
            internalPanel.setLayout(null);
            internalPanel.setBounds(10, 45, 380, 125);
            internalPanel.setBackground(Color.blue);
            panel.add(internalPanel);
            {

                label = new JLabel("Ongoing Trials");
                label.setBounds(10, 5, 130, 25);
                label.setForeground(Color.white);
                internalPanel.add(label);

                ongoingButton = new OngoingButton();
                ongoingButton.setBounds(145, 5, 90, 25);
                internalPanel.add(ongoingButton);

                label = new JLabel("Trials History");
                label.setBounds(10, 35, 130, 25);
                label.setForeground(Color.white);
                internalPanel.add(label);

                historyButton = new HistoryButton();
                historyButton.setBounds(145, 35, 90, 25);
                internalPanel.add(historyButton);

                label = new JLabel("Start New Trials");
                label.setBounds(10, 65, 130, 25);
                label.setForeground(Color.white);
                internalPanel.add(label);

                startTrialButton = new StartTrialButton();
                startTrialButton.setBounds(145, 65, 90, 25);
                internalPanel.add(startTrialButton);

                label = new JLabel("Create New Trial");
                label.setBounds(10, 95, 130, 25);
                label.setForeground(Color.white);
                internalPanel.add(label);

                createTrialButton = new CreateTrialButton();
                createTrialButton.setBounds(145, 95, 90, 25);
                internalPanel.add(createTrialButton);
            }
        }
    }

    class OngoingButton extends JButton implements ActionListener {
        OngoingButton() {
            super("Check");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            new OngoingWindow().setVisible(true);
        }
    }

    class HistoryButton extends JButton implements ActionListener {
        HistoryButton() {
            super("Check");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            new HistoryWindow().setVisible(true);
        }
    }

    class StartTrialButton extends JButton implements ActionListener {
        StartTrialButton() {
            super("Search");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            new StartTrialWindow().setVisible(true);
        }
    }

    class CreateTrialButton extends JButton implements ActionListener {
        CreateTrialButton() {
            super("Create");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            new NewTrialWindow().setVisible(true);
        }
    }
}
