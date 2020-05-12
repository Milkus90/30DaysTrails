package pl.Ghaneal.Trials;


import javax.swing.*;
import java.awt.*;

public class NewTrailWindow extends JFrame {

    private JPanel panel, internalPanel;
    private JLabel text;
    private JButton button;

    public NewTrailWindow() {
        super("30 Days Trials - Create New Trial");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(10, 70, 400, 600);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
    }
}