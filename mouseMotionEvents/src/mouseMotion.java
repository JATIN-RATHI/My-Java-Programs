import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mouseMotion extends Applet implements MouseMotionListener, MouseListener {
    String txt;
    String str;
    public void init()
    {
        addMouseMotionListener(this);
        addMouseListener(this);
        setBackground(Color.cyan);
        setForeground(Color.blue);
    }

    public void mouseMoved(MouseEvent me)
    {
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.white);
        txt = "Mouse Moved!";
        repaint();
        showStatus("Mouse Moved!");
    }
    public void mouseDragged(MouseEvent me)
    {
        setBackground(Color.pink);
        setForeground(Color.black);
        txt = "Mouse Dragged!";
        repaint();
        showStatus("Mouse Dragged!");
    }
    public void mousePressed(MouseEvent e)
    {
        str = "You pressed mouse";
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {
        str = "You released mouse";
        repaint();
    }
    public void mouseClicked(MouseEvent e)
    {
        str = "You clicked mouse";
        repaint();
    }
    public void mouseEntered(MouseEvent e)
    {
        str = "Mouse entered frame";
        repaint();
    }
    public void mouseExited(MouseEvent e)
    {
        str = "Mouse existed frame";
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(txt, 100,100);
        g.drawString(str, 150,150);
    }
}
