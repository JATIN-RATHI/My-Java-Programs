import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trafficLightButton extends Applet implements ActionListener {
    String msg;
    Button red, yellow, green;
    public void init()
    {
        red = new Button("Red");
        yellow = new Button("Yellow");
        green = new Button("Green");//button created

        add(red);   //button added to applet
        add(yellow);
        add(green);

        red.addActionListener(this);    //on click event
        yellow.addActionListener(this);
        green.addActionListener(this);

        setBackground(Color.black);
        setForeground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        msg  = e.getActionCommand();
        repaint();
    }
    public void paint(Graphics j)
    {
        j.drawRect(100,100,100,260); //inner rect
        j.drawRect(90,90,120,280); //outer rect

        j.setColor(Color.white);
        j.fillRect(135,370,30,90);

        if(msg.equals("Red"))
        {
            j.setColor(Color.red);
            j.fillOval(120,120,60,60);
        }
        if(msg.equals("Yellow"))
        {
            j.setColor(Color.yellow);
            j.fillOval(120,200,60,60);
        }
        if(msg.equals("Green"))
        {
            j.setColor(Color.green);
            j.fillOval(120,280,60,60);
        }

    }
}
