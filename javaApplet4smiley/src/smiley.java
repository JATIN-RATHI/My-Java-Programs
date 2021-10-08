import java.applet.Applet;
import java.awt.*;

public class smiley extends Applet {
    public void init()
    {
        setBackground(Color.pink);
    }
    public void paint(Graphics j)
    {
        j.setColor(Color.yellow);
        j.fillOval(100,50,200,200);

        j.setColor(Color.white);
        j.fillOval(145,100,30,30);

        j.setColor(Color.white);
        j.fillOval(225,100,30,30);

        j.setColor(Color.white);
        j.fillArc(120,100,160,130,180, 180);

    }
}
