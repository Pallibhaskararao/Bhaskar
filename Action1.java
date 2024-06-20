import java.awt.*;
import java.awt.event.*;

public class Action1 extends Frame implements ActionListener {
    Button b;

    public void actionPerformed(ActionEvent e) {
        setBackground(Color.BLUE);
        System.out.println("mouse clicked");
    }

    Action1() {
        super("GUI"); // Set the title of the frame
        setSize(500, 500); // Set the size of the frame
        setLayout(null); // Set the layout to null
        setVisible(true); // Make the frame visible

        b = new Button("Bhaskar");
        b.setBounds(100, 100, 100, 30); // Set the bounds of the button
        add(b); // Add the button to the frame
        b.addActionListener(this); // Add the action listener to the button
    }

    public static void main(String[] args) {
        new Action1();
    }
}