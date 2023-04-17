import javax.swing.*;
import java.awt.*;

public class lab10 {
    public static void main(String[] args) {
        tuneWindowForVariant8(new JFrame(), 380);
        new MyWindow();
    }

    public static void tuneWindowForVariant8(JFrame window) {
        tuneWindowForVariant8(window, 0);
    }

    public static void tuneWindowForVariant8(JFrame window, int leftMargin) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setUndecorated(true);
        window.setTitle("Upper right window");
        window.setSize(350, 450);
        window.setLocation(screenSize.width - window.getWidth() - leftMargin, 0);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setOpacity(0.5f);
        window.setVisible(true);
        JPanel info = getInfoForVariant8(window);
        window.add(info);
        info.revalidate();
    }

    public static JPanel getInfoForVariant8(JFrame window) {
        Dimension dimension = window.getSize();
        Point location = window.getLocation();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Dimensions: width - " + dimension.width + " height - " + dimension.height));
        panel.add(new JLabel("Location: x - " + location.x + " y - " + location.y));
        panel.add(new JLabel("Title: " + window.getTitle()));
        panel.add(new JLabel("State: Opacity " + window.getOpacity()));
        return panel;
    }

}
