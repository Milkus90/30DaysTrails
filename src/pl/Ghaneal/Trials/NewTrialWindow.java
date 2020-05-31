package pl.Ghaneal.Trials;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NewTrialWindow extends JFrame {

    private JPanel panel, internalPanel;
    private JLabel label, nameLabel, descritpionLabel, toDoLabel, isProgressiveLabel, startValueLabel,
                    dailyChangeLabel;
    private JTextField nameField, descriptionField, toDoField, startValueField, dailyChangeField;
    private JCheckBox isProgressiveCheck;
    private JButton createButton, cancelButton;

    public NewTrialWindow() {
        super("30 Days Trials - Create New Trial");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(10, 70, 400, 600);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);{

            label = new JLabel("Create New Trial");
            label.setBounds(10, 10, 390, 25);
            label.setHorizontalAlignment(JLabel.CENTER);
            panel.add(label);

            internalPanel = new JPanel();
            internalPanel.setLayout(null);
            internalPanel.setBounds(10, 45, 380, 260);
            internalPanel.setBackground(Color.blue);
            panel.add(internalPanel);{

                nameLabel = new JLabel("Trial Name:");
                nameLabel.setBounds(10, 5, 130, 25);
                nameLabel.setForeground(Color.white);
                internalPanel.add(nameLabel);

                nameField = new JTextField("My new Trial");
                nameField.setBounds(145, 5, 200, 25);
                internalPanel.add(nameField);

                descritpionLabel = new JLabel("Trial Description:");
                descritpionLabel.setBounds(10, 35, 130, 25);
                descritpionLabel.setForeground(Color.white);
                internalPanel.add(descritpionLabel);

                descriptionField = new JTextField("Write the descritpion of Your Trial...");
                descriptionField.setBounds(145, 35, 200, 50);
                internalPanel.add(descriptionField);

                toDoLabel = new JLabel("Trial 'to do':");
                toDoLabel.setBounds(10, 90, 130, 25);
                toDoLabel.setForeground(Color.white);
                internalPanel.add(toDoLabel);

                toDoField = new JTextField("ex. 'do 5 pushups'");
                toDoField.setBounds(145, 90, 200, 25);
                internalPanel.add(toDoField);

                isProgressiveLabel = new JLabel("Type of the Trial");
                isProgressiveLabel.setBounds(10, 120, 130, 25);
                isProgressiveLabel.setForeground(Color.white);
                internalPanel.add(isProgressiveLabel);

                isProgressiveCheck = new JCheckBox("Progressive.");
                isProgressiveCheck.setBounds(145, 120, 200, 25);
                internalPanel.add(isProgressiveCheck);

                startValueLabel = new JLabel("Starting value:");
                startValueLabel.setBounds(10, 150, 130, 25);
                startValueLabel.setForeground(Color.white);
                internalPanel.add(startValueLabel);

                startValueField = new JTextField("Only if progressive...");
                startValueField.setBounds(145, 150, 200, 25);
                internalPanel.add(startValueField);

                dailyChangeLabel = new JLabel("Daily change:");
                dailyChangeLabel.setBounds(10, 180, 130, 25);
                dailyChangeLabel.setForeground(Color.white);
                internalPanel.add(dailyChangeLabel);

                dailyChangeField = new JTextField("Only if progressive...");
                dailyChangeField.setBounds(145, 180, 200, 25);
                internalPanel.add(dailyChangeField);

                createButton = new CreateButton();
                createButton.setBounds(85, 230, 90, 25);
                internalPanel.add(createButton);

                cancelButton = new CancelButton();
                cancelButton.setBounds(205, 230, 90, 25);
                internalPanel.add(cancelButton);
            }
        }
    }

    class CreateButton extends JButton implements ActionListener{

        CreateButton(){
            super("Create");
            addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            if(isProgressiveCheck.isSelected()){
                ProgressiveTrial progressiveTrial = new ProgressiveTrial(nameField.getText(),
                        descriptionField.getText(), toDoField.getText(), true,
                        Double.parseDouble(startValueField.getText()),
                                Double.parseDouble(dailyChangeField.getText()));
                Save s = new Save();
                try {
                    s.save(progressiveTrial, "trialDatabase.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                BasicTrial basicTrial = new BasicTrial(nameField.getText(),
                        descriptionField.getText(), toDoField.getText(), false);
                Save s = new Save();
                try {
                    s.save(basicTrial, "trialDatabase.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            NewTrialWindow.this.dispose();
        }
    }

    class CancelButton extends JButton implements ActionListener{

        CancelButton(){
            super("Cancel");
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            NewTrialWindow.this.dispose();
        }
    }
}