import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class detectColor extends Applet implements ItemListener {
    Checkbox a, b, c;
    CheckboxGroup grp;
    public void init()
    {
        grp = new CheckboxGroup();
        a = new Checkbox("Red : ", grp, false);
        b = new Checkbox("Cyan : ", grp, false);
        c = new Checkbox("Yellow : ", grp, false);
        add(a);
        add(b);
        add(c);

        a.addItemListener(this);
        b.addItemListener(this);
        c.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    public void paint(Graphics g)
    {
        if(a.getState())
        {
            setBackground(Color.red);
        }
        if(b.getState())
        {
            setBackground(Color.cyan);
        }
        if(c.getState())
        {
            setBackground(Color.yellow);
        }
    }
}
