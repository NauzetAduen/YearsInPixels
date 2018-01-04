
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public final class ColorDialog extends javax.swing.JDialog {

    public ColorDialog(java.awt.Frame parent, boolean modal, JButton parentButton) {
        super(parent, modal);
        this.setTitle("Pick a pixel");
        this.setLocation(200, 200);
        this.setSize(250, 200);

        initButtons(parentButton);

    }

    public void initButtons(JButton parentButton) {
        Color[] arrayColors = {Color.red, Color.orange, Color.yellow, Color.blue, Color.green};
        for (int i = 0; i < 5; i++) {
            Container pane = getContentPane();
            pane.setLayout(null);
            JButton colorButton = createButton(i, arrayColors[i]);
            setListener(colorButton, parentButton);
            pane.add(colorButton);

        }

    }
    private JButton createButton(int i, Color color){
        JButton colorButton = new JButton();
        colorButton.setBackground(color);
        colorButton.setSize(50, 50);
        colorButton.setLocation(50 * i, 50);
        return colorButton;
    }
    private void setListener(JButton button, JButton parentButton){
        button.addActionListener((ActionEvent e) -> {
            parentButton.setContentAreaFilled(true);
            parentButton.setBackground(button.getBackground());

            dispose();

        });
    }

}
