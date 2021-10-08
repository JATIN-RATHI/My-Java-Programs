import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class loginAwt {
    public static void main(String[]args)
    {
        Frame f=new Frame("Login Form");
        f.setLayout(new FlowLayout());
        f.setSize(300,400);
        f.setVisible(true);
        f.setBackground(Color.yellow);
        Label name = new Label("Name : ");
        TextField nm = new TextField(20);

        Label course = new Label("Course : ");
        TextField cr = new TextField(20);

        Label roll = new Label("Roll No. : ");
        TextField rn = new TextField(20);

        Label clr = new Label("Country : ");
        Choice ch = new Choice();
        ch.add("India");
        ch.add("USA");
        ch.add("UK");
        ch.add("CANADA");
        ch.add("AUSTRALIA");
        ch.add("FRANCE");
        ch.add("SPAIN");

        Button log = new Button("Login");
        Label printnm = new Label();
        Label printcr = new Label();
        Label printrn = new Label();
        Label printcy = new Label();
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    printnm.setText(nm.getText());
                    printcr.setText(cr.getText());
                    printrn.setText(rn.getText());
                    printcy.setText(ch.getSelectedItem());

            }
        });
        f.add(name); f.add(nm);
        f.add(course); f.add(cr);
        f.add(roll); f.add(rn);
        f.add(clr); f.add(ch);
        f.add(log);
        f.add(printnm); f.add(printcr); f.add(printrn); f.add(printcy);
    }
}
