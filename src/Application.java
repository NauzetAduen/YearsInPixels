import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        YearsInPixels panel = new YearsInPixels();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
