import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myButton extends Applet implements ActionListener {

    Button b;
    Label l;
    public void init()
    {
        l = new Label("JAVA :", Label.LEFT);
        b = new Button("Yes!");
        add(l);
        add(b);
        b.addActionListener(this); //on click event
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();  //text of button
        l.setText(str);
    }

}
