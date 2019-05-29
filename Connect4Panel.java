import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;                                  //all of these are various import statements
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class Connect4Panel extends JPanel implements MouseListener,MouseMotionListener
{
    private static int circleWidth,circleHeight;
    private static int fX, fY;
    private static int rectAX;
    private static int rectBX;
    private static int rectCX;
    private static int rectDX;
    private static int rectEX;
    private static int rectFX;

    private static int rectY;
    private static int rectYB;
    private static int rectYC;
    private static int rectYD;
    private static int rectYE;
    private static int rectYF;

    private static int rectWidth;
    private static int rectHeight;

    public int x,y,startX,startY,spaceX,spaceY;
    private static Rectangle rectA;
    private static Rectangle rectB;
    private static Rectangle rectC;
    private static Rectangle rectD;
    private static Rectangle rectE;
    private static Rectangle rectF;
    private static Rectangle rectG;
    private static Rectangle rectButton1;
    private static Rectangle rectButton2;

    private boolean stop;                       //variables for game state
    private boolean gameStarted;
    private boolean hover;                      //variables for mouse state
    private boolean hoverQ;


    private static int mX;
    private static int mY;
    private int player;
    private boolean win;

    public Connect4Control con;// creating an instance of Connect4Control class

    public Connect4Panel()
    {
        fX = 40;
        fY = 110;
        circleWidth = 39;
        circleHeight = 39;
        rectAX = 13;
        rectBX = 58;
        rectCX = 103;
        rectDX = 146;
        rectEX = 190;
        rectFX = 234;
        rectY = 145;
        rectYB = 194;
        rectYC = 238;
        rectYD = 282;
        rectYE = 326;
        rectYF = 370;
        rectWidth = 37;
        rectHeight = 270;

        rectY = 145;
        this.setSize(350,300);
        this.setVisible(true);

    //    icon = new ImageIcon("C:/Users/Redemptie/workspace/pong/image/connect42.png");
    //    icon2 = new ImageIcon("C:/Users/Redemptie/workspace/pong/image/madBoySprite.png");
    //    icon3 = new ImageIcon("C:/Users/Redemptie/workspace/pong/image/mario.png");
    //    img = icon.getImage();
    //    img2 = icon2.getImage();
    //    img3 = icon3.getImage();

        con = new Connect4Control();
        rectButton1 = new Rectangle(25,50,133,50);
        rectButton2 = new Rectangle(170,50,133,50);
        rectA = new Rectangle(rectAX, rectY, rectWidth, rectHeight);
        rectB = new Rectangle(rectBX, rectY, rectWidth, rectHeight);
        rectC = new Rectangle(rectCX, rectY, rectWidth, rectHeight);
        rectD = new Rectangle(rectDX, rectY, rectWidth, rectHeight);
        rectE = new Rectangle(rectEX, rectY, rectWidth, rectHeight);
        rectF = new Rectangle(rectFX, rectY, rectWidth, rectHeight);
        rectG = new Rectangle(277,145,37,270);

        stop = false;
        gameStarted = false;
        hover = false;
        hoverQ = false;

        spaceX =- 60;
        spaceY = 300;

        this.setFocusable(true);
        this.requestFocus();
        addMouseListener(this);	// use mouse motion listener and mouse listener you will see this is implemented at the class
        addMouseMotionListener(this);
    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0,0,350,510);

        //the array will be used to paint the squares. if value 1 or 2 will depend on the color being painted
        if(con.cont[1][1]==0){
            g.setColor(Color.gray);  //the color gray will be a blank, yellow and red will be a move for one of the players.
            g.fillOval(rectAX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectY, circleWidth, circleHeight);
            System.out.println(" red 1");
        }
        if(con.cont[1][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectY, circleWidth, circleHeight);
        }
        if(con.cont[1][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 150, 39, 39);
        }
        if(con.cont[1][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 150, 39, 39);
        }
        if(con.cont[1][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 150, 39, 39);    //62
        }
        //row b
        if(con.cont[2][1]==0){
            g.setColor(Color.gray);
            g.fillOval(rectAX, rectYB, circleWidth, circleHeight);//the coordinates of the columns change as shown: x=103 y=105 for c3... x-13 for a3... x=58 for b3.. d3 x=146.. e3 x=190.. f3 x=234..  g3 x=277
        }
        if(con.cont[2][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectYB, circleWidth, circleHeight);
        }
        if(con.cont[2][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 194, 39, 39);
        }
        if(con.cont[2][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 194, 39, 39);
        }
        if(con.cont[2][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 194, 39, 39);    //62
        }

        // row c    106
        if(con.cont[3][1]==0){
            g.setColor(Color.gray);
            g.fillOval(rectAX, rectYC, 39, 39);//the coordinates of the columns change as shown: x=103 y=105 for c3... x-13 for a3... x=58 for b3.. d3 x=146.. e3 x=190.. f3 x=234..  g3 x=277
        }
        if(con.cont[3][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectYC, circleWidth, circleHeight);
        }
        if(con.cont[3][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 238, 39, 39);
        }
        if(con.cont[3][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 238, 39, 39);
        }
        if(con.cont[3][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 238, 39, 39);    //62
        }

        // row d     150
        if(con.cont[4][1]==0){
            g.setColor(Color.gray);
            g.fillOval(rectAX, rectYD, circleWidth, circleHeight);//the coordinates of the columns change as shown: x=103 y=105 for c3... x-13 for a3... x=58 for b3.. d3 x=146.. e3 x=190.. f3 x=234..  g3 x=277
        }
        if(con.cont[4][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectYD, circleWidth, circleHeight);
        }
        if(con.cont[4][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 282, 39, 39);
        }
        if(con.cont[4][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 282, 39, 39);
        }
        if(con.cont[4][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 282, 39, 39);    //62
        }

        //row e       194
        if(con.cont[5][1]==0){
            g.setColor(Color.gray);
            g.fillOval(rectAX, rectYE, circleWidth, circleHeight);//the coordinates of the columns change as shown: x=103 y=105 for c3... x-13 for a3... x=58 for b3.. d3 x=146.. e3 x=190.. f3 x=234..  g3 x=277
        }
        if(con.cont[5][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectYE, circleWidth, circleHeight);
        }
        if(con.cont[5][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 326, 39, 39);
        }
        if(con.cont[5][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 326, 39, 39);
        }
        if(con.cont[5][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 326, 39, 39);    //62
        }

        //row f       238
        if(con.cont[6][1]==0){
            g.setColor(Color.gray);
            g.fillOval(rectAX, rectYF, circleWidth, circleHeight);//the coordinates of the columns change as shown: x=103 y=105 for c3... x-13 for a3... x=58 for b3.. d3 x=146.. e3 x=190.. f3 x=234..  g3 x=277
        }
        if(con.cont[6][1]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectAX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][1]==2){
            g.setColor(Color.red);
            g.fillOval(rectAX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][2]==0){
            g.setColor(Color.gray);
            g.fillOval(rectBX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][2]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectBX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][2]==2){
            g.setColor(Color.red);
            g.fillOval(rectBX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][3]==0){
            g.setColor(Color.gray);
            g.fillOval(rectCX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][3]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectCX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][3]==2){
            g.setColor(Color.red);
            g.fillOval(rectCX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][4]==0){
            g.setColor(Color.gray);
            g.fillOval(rectDX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][4]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectDX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][4]==2){
            g.setColor(Color.red);
            g.fillOval(rectDX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][5]==0){
            g.setColor(Color.gray);
            g.fillOval(rectEX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][5]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectEX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][5]==2){
            g.setColor(Color.red);
            g.fillOval(rectEX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][6]==0){
            g.setColor(Color.gray);
            g.fillOval(rectFX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][6]==1){
            g.setColor(Color.yellow);
            g.fillOval(rectFX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][6]==2){
            g.setColor(Color.red);
            g.fillOval(rectFX, rectYF, circleWidth, circleHeight);
        }
        if(con.cont[6][7]==0){
            g.setColor(Color.gray);
            g.fillOval(277, 370, 39, 39);
        }
        if(con.cont[6][7]==1){
            g.setColor(Color.yellow);
            g.fillOval(277, 370, 39, 39);
        }
        if(con.cont[6][7]==2){
            g.setColor(Color.red);
            g.fillOval(277, 370, 39, 39);    //62
        }
        if(!hover)
            g.setColor(Color.pink);
        else
            g.setColor(Color.cyan);
        g.fillRect(25, 50, 133, 50);
        g.setFont(new Font("Arial", Font.BOLD,14));
        if(!hoverQ)
            g.setColor(Color.pink);                         //if the mouse is not hovering over the button dont change color
        else
            g.setColor(Color.cyan);                         //otherwise do change color
        g.fillRect(172, 50, 133, 50);
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD,18));
        g.drawString(" New Game ", 40, 82);
        g.drawString(" Exit Game ", 187, 82);
        g.setColor(Color.red);

        if(gameStarted==true){
            if(con.getWin() == true){
                player=con.getPlayer();
                g.setFont(new Font("Arial", Font.BOLD,18));
                stop=true;
                if(player==1){
                    g.setColor(Color.yellow);
                    g.drawString("         You Win!", 80, 130);
                    g.setFont(new Font("Arial", Font.BOLD,26));
                    g.drawString("         You Win!", 46, 470);
                }
                if(player==2){
                    g.setColor(Color.red);
                    g.drawString("         You Win!", 80, 130);
                    g.setFont(new Font("Arial", Font.BOLD,26));
                    g.drawString("         You Win!", 48, 470);
                }
            }else if(player==1){
                g.setFont(new Font("Arial", Font.BOLD,18));
                g.setColor(Color.red);
                g.drawString("         Red To Move ", 50, 130);
                g.setFont(new Font("Arial", Font.BOLD,26));
                g.drawString("    Red To Move ", 46, 470);
            }else if(player==2){
                g.setFont(new Font("Arial", Font.BOLD,18));
                g.setColor(Color.yellow);
                g.drawString("         Yellow To Move ", 50, 130);
                g.setFont(new Font("Arial", Font.BOLD,26));
                g.drawString("    Yellow To Move ", 46, 470);
            }
        }
        g.dispose();
    }

    /*
     * this is where the control of the game happens, players click on the column they want to move to
     * and then the next player does until there are no free spaces left.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        player=con.getPlayer();
        // TODO Auto-generated method stub
        if(stop==false){
            if(gameStarted == true){

                mX = e.getX();
                mY = e.getY();
                if(mX > rectA.x && mX < rectA.x + rectA.width && mY > rectA.y && mY < rectA.y + rectA.height){

                    x = 13;
                    y = 238;
                    //col 1

                    if(player==2){
                        player=1;
                        con.setPlayer(player);
                    }
                    else{
                        player=2;
                        con.setPlayer(player);
                    }

                    con.checkCol1();

                    repaint();
                    con.win();
                }
                if(mX > rectB.x && mX < rectB.x + rectB.width && mY > rectB.y && mY < rectB.y + rectB.height){

                    x = 58;
                    y = 238;
                    //col 2
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol2();
                    repaint();
                    con.win();
                }
                if(mX > rectC.x && mX < rectC.x + rectC.width && mY > rectC.y && mY < rectC.y + rectC.height){

                    x = 105;
                    y = 238;
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol3();
                    repaint();
                    //col 3
                    con.win();
                }
                if(mX > rectD.x && mX < rectD.x + rectD.width && mY > rectD.y && mY < rectD.y + rectD.height){//collision detection

                    x = 146;
                    y = 238;
                    //col 4
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol4();
                    repaint();
                    con.win();
                }
                if(mX > rectE.x && mX < rectE.x + rectE.width && mY > rectE.y && mY < rectE.y + rectE.height){

                    x = 190;
                    y = 238;
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol5();
                    repaint();
                    //col 5
                    con.win();
                }
                if(mX > rectF.x && mX < rectF.x + rectF.width && mY > rectF.y && mY < rectF.y + rectF.height){

                    x = 234;
                    y = 238;
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol6();
                    repaint();
                    //col 6
                    con.win();
                }
                if(mX > rectG.x && mX < rectG.x + rectG.width && mY > rectG.y && mY < rectG.y + rectG.height){

                    x = 277;
                    y = 238;
                    if(player==1){
                        player=2;
                        con.setPlayer(player);
                    }
                    else{
                        player=1;
                        con.setPlayer(player);
                    }
                    con.checkCol7();
                    repaint();
                    //col 7
                    con.win();
                }
            }//if statement stop game
        }//if statement game started
        startX=e.getX();
        startY=e.getY();
        if(startX > rectButton1.x && startX < rectButton1.x+rectButton1.width&& startY > rectButton1.y && startY <rectButton1.y +rectButton1.height )
        {gameStarted=true;
            if(gameStarted == true || stop == true){
                stop=false;
                for(int row = 1;row < 7;row++){

                    for(int col = 1;col < 8;col++)
                    {
                        con.cont[row][col] = 0;
                    }

                    this.win = false;
                    con.setWin(this.win);
                    repaint();
                }
            }
        }
        if(startX > rectButton2.x && startX< rectButton2.x+rectButton2.width && startY > rectButton2.y && startY < rectButton2.y +rectButton2.height ){
            System.exit(1);
        }

    }

    //all of the methods below track the movement and actions of the mouse

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseDragged(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseMoved(MouseEvent em) {//mousedmoved implemente from the abstract classed for the mouse listeners with
        // TODO Auto-generated method stub
        int startX = em.getX();
        int startY = em.getY();

        //the string of code below checks what the cursor is hovering over and reacts accordingly

        if(startX > rectButton1.x && startX< rectButton1.x+rectButton1.width && startY > rectButton1.y && startY < rectButton1.y +rectButton1.height )
        {
            hover = true;
            repaint();
        }
        else{
            hover=false;
            repaint();
        }
        if(startX > rectButton2.x && startX< rectButton2.x+rectButton2.width && startY > rectButton2.y && startY < rectButton2.y +rectButton2.height ){
            hoverQ=true;
            repaint();
        }
        else{
            hoverQ=false;
            repaint();
        }
    }
}