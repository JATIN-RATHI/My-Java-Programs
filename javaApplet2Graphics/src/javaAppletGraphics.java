import java.applet.Applet;
import java.awt.*;

public class javaAppletGraphics extends Applet {
    public void init()
    {
        setBackground(Color.yellow);
        setForeground(Color.blue);
    }
    public void paint(Graphics j)
    {
        j.drawOval(100,100,100,100); //hollow circle
        j.drawRect(220,100,20,100); //hollow rect

        j.fillRect(10,100,30,100); // filled rectangle
        j.fillArc(30,10,100,100, 0,90);// filled 1/4 circle

        j.drawLine(50, 80, 0,0);  //slant line from (x,y) (50,80)
        j.fillArc(60,180,80,60,180,180);   //filled semi circle
    }
}
