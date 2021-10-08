import java.applet.Applet;
import java.awt.*;
public class HelloWorld extends Applet {
    public void init()
    {
        setBackground(Color.pink;
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello World!", 30, 30);
    }
}