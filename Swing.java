import javax.swing.*;
import java.awt.*;


public class Swing extends JFrame {
    public JLabel label;
    public JTextField textField;

    public Swing() {
        setTitle("Celebrity");
        setLayout(new FlowLayout());


        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

}