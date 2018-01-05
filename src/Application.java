import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        YearsInPixels pixelPanel = new YearsInPixels();

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(500,800));
        mainPanel.setBackground(Color.red);
        mainPanel.add(pixelPanel);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);

    }
}
