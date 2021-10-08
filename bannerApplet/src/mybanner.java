import java.applet.Applet;
import java.awt.*;
//left to right movement
public class mybanner extends Applet implements Runnable {
    String str = "This application is under construction!    ";
    boolean stop;   //controls movement
    public void init()
    {
        setBackground(Color.black);
        setForeground(Color.yellow);
    }
    public void start()
    {
        Thread t = new Thread(this);
        stop = false;
        t.start();    //will start thread
    }
    public void run()
    {
        char ch;
        for(;;) //infinite loop
        {
            try
            {
                repaint();
                Thread.sleep(100);
                ch = str.charAt(0); //! which is last character
                str = str.substring(1, str.length());
                str += ch;
            } catch (InterruptedException e) {    }
        }
    }
    public void stop()  //in case of minimize or exit of the application
    {
        stop = true;
    }

    public void paint(Graphics g)
    {
        Font f = new Font("Impact", Font.ITALIC,40);
        g.setFont(f);
        g.drawString(str, 50, 300);
    }
}
