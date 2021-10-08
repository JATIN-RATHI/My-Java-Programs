import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyEvents extends Applet implements KeyListener {
    char ch;
    String txt;
    public void init()
    {
        addKeyListener(this);
        setBackground(Color.yellow);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        ch = e.getKeyChar();
        repaint();
        showStatus("KEY PRESSED!");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("KEY RELEASED!");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        txt += e.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(String.valueOf(ch),50,50);
        g.drawString(txt, 100,100);
    }
}
