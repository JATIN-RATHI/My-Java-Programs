import javax.swing.*;

public class jframedemo extends JFrame{
    JFrame jframe;
    JLabel jlb;
    ImageIcon icon;
    public jframedemo()
    {
        jframe = new JFrame("Demo of JFRAME");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            icon = new ImageIcon(getClass().getResource("calculator.png"));
            jlb = new JLabel(icon);
            jframe.add(jlb);
        }
        catch(Exception e)
        {
            System.out.println("Image not found!");
        }
        jframe.pack();
        jframe.setVisible(true);
    }
    public static void main(String[]args)
    {
        jframedemo demo = new jframedemo();
    }
}
