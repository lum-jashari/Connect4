import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Connect4 extends JFrame
{
    private static final long serialVersionUID = 1L;
    public Connect4Panel pan;
    public Dimension dim;
    int locX;
    int locY;

    public Connect4()
    {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        locX=(int) dim.getWidth() * 4/12;//this is to set the game into the center of the screen
        locY=(int) dim.getHeight() * 2/12;
        pan = new Connect4Panel();

        this.setTitle("Connect4");
        this.setSize(350,520);
        this.setLocation(locX, locY);
        this.add(pan);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setFocusable(true);
        this.setResizable(false);
    }

    public static void main(String[] args)
    {
        new Connect4();
    }
}