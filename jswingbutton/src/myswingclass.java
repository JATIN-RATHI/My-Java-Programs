import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class myswingclass implements ActionListener {
    public myswingclass()
    {
        JFrame jframe = new JFrame("Welcome to demo!");
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(700,500);
        //adding buttons to frame with img
        //button 1
        ImageIcon calci = new ImageIcon("calculator.png");      //importing image
        JButton jb = new JButton(calci);                          //creating button of name
        jb.setActionCommand("Calculator");                              //on click event this text will be pass
        jb.addActionListener(this);                                    //event listener , when clicked it will send data or respond
        jframe.add(jb);                                                  //adding button to frame(visible)
        //button 2
        ImageIcon cam = new ImageIcon("camera.png");
        jb = new JButton(cam);
        jb.setActionCommand("Camera");
        jb.addActionListener(this);
        jframe.add(jb);
        //button 2
        ImageIcon paint = new ImageIcon("paint.png");
        jb = new JButton(paint);
        jb.setActionCommand("Paint");
        jb.addActionListener(this);
        jframe.add(jb);
        //button 2
        ImageIcon search = new ImageIcon("search.png");
        jb = new JButton(search);
        jb.setActionCommand("Search");
        jb.addActionListener(this);
        jframe.add(jb);

        //Label
        JLabel jlb = new JLabel("Welcome! to JSwing button demo");
        jframe.add(jlb);
        //Display the frame and elements
        jframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Calculator"))
        {
            try {
                Desktop.getDesktop().browse(new URL("https://www.google.com").toURI());
            } catch (IOException | URISyntaxException io) {     }
        }
        if(e.getActionCommand().equals("Camera"))
        {

        }
        if(e.getActionCommand().equals("Paint"))
        {

        }
        if(e.getActionCommand().equals("Search"))
        {

        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        new myswingclass();
                    }
                }
        );
    }
}
