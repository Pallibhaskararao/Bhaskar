import java.awt.*;
import java.awt.event.*;
public class MouseEvent1 extends Frame implements MouseListener
{
    static Label l;
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("mouse Entered");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("mouse exited");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("mouse pressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l.setText("mouse Released");
    }
    MouseEvent1()
    {
        super("my example");
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
        l = new Label("hi");
        l.setBounds(100,100,300,300);
        l.setBackground(Color.black);
        l.setForeground(Color.WHITE);
        add(l);
        addMouseListener(this);
    }
    public static void main(String[] args) {
        new MouseEvent1();
    }
}
