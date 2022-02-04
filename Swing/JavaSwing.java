import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click Me");
        b.setBounds(130, 100, 100, 100);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}