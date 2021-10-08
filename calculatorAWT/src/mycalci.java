import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mycalci extends Applet implements ActionListener {
    int a, b;
    String ch;
    Button add, sub, mul, div;
    Label lb1 , lb2, lb3;
    TextField tf1, tf2, tf3;
    public void init()
    {

        lb1 = new Label("A : ");
        tf1 = new TextField();

        lb2 = new Label("B : ");
        tf2 = new TextField();

        lb3 = new Label("Result : ");
        tf3 = new TextField();

        add(lb1);
        add(lb2);
        add(lb3);
        add(tf1);
        add(tf2);
        add(tf3);
        add = new Button("Add");

        sub = new Button("Subtract");

        mul = new Button("Multiply");

        div = new Button("Divide");

        add(add);
        add.addActionListener(this);
        add(sub);
        sub.addActionListener(this);
        add(mul);
        mul.addActionListener(this);
        add(div);
        div.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int result = 0;
        a = Integer.parseInt(tf1.getText());
        b = Integer.parseInt(tf2.getText());
        ch = e.getActionCommand();  //text of button pressed
        if(ch.equals("Add"))
        {
            result = a + b;
        }
        if(ch.equals("Subtract"))
        {
            result = a - b;
        }
        if(ch.equals("Multiply"))
        {
            result = a * b;
        }
        if(ch.equals("Divide"))
        {
            result = a / b;
        }
        tf3.setText(String.valueOf(result));
    }
}
