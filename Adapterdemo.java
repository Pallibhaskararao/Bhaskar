import java.awt.*;
import java.awt.event.*;

public class Adapterdemo extends Frame implements KeyListener {
    public Adapterdemo() {
        super("Adapter Demo");

        // Create a label
        Label label = new Label("Hello, world!");

        // Add a MouseAdapter to the label
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }
        });

        // Add the label to the frame
        add(label);

        // Add the KeyListener to the frame
        addKeyListener(this);

        // Set the frame properties
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        // Request focus for the frame to receive key events
        requestFocus();
    }

    // Implement the KeyListener interface
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key released");
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed");
    }

    public static void main(String[] args) {
        new Adapterdemo();
    }
}