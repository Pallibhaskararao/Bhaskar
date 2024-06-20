import java.awt.*;
import java.awt.event.*;

public class KeyEvent1 extends Frame implements KeyListener {
    static Label l;
    static TextArea area;

    KeyEvent1() {
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        area.addKeyListener(this); // Register the key listener with the text area
        area.setFocusable(true); // Make the text area focusable so it can receive key events
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("key Typed");
    }

    public static void main(String[] args) {
        new KeyEvent1();
    }
}
