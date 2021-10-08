import java.applet.*;
import java.awt.*;
public class studentInfo extends Applet{
    String name, roll, marks;
    public void init()
    {
        name = getParameter("name");
        roll = getParameter("roll");
        marks = getParameter("marks");

    }
    public void paint(Graphics g)
    {
        g.drawString(name, 100,110);
        g.drawString(roll, 100,120);
        g.drawString(marks, 100,130);
    }
}
