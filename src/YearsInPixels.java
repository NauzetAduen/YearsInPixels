import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class YearsInPixels extends JPanel {
    private final int DAYS_IN_MONTH = 31;
    private final int MONTH_IN_YEAR = 12;
    private final int BUTTON_SIZE = 40;

    public YearsInPixels() {
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(DAYS_IN_MONTH, MONTH_IN_YEAR));
        initButtons();



    }
    private void initButtons(){
        for (int month = 1; month <= MONTH_IN_YEAR; month++) {
            for (int days = 1; days <= DAYS_IN_MONTH; days++) {
                JButton button = createButton();
                setListener(button);
                this.add(button);
            }

        }
    }
    private JButton createButton(){
        JButton button = new JButton();
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
        button.setFocusable(false);
        //button.setLocation(month * BUTTON_SIZE , day * BUTTON_SIZE);
        return button;

    }

    private void setListener(JButton button){
        button.addActionListener((ActionEvent e) -> {
        ColorDialog cd = new ColorDialog(null, true, button);
        cd.setVisible(true);});
    }
}
