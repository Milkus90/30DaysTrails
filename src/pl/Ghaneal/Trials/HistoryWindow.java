package pl.Ghaneal.Trials;

import javax.swing.*;

public class HistoryWindow extends JFrame {

    private JPanel panel, internalPanel;
    private JLabel label;
    private JButton button;

    public HistoryWindow() {
        super("30 Days Trials - Your Trials History");
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setBounds(10, 70, 400, 600);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
    }
}
