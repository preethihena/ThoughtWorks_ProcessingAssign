import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 360;
    public static final int DIAMETER = 10;

    public static final int height_Ball1 = HEIGHT/5;
    public static final int height_Ball2 = (2*HEIGHT)/5;
    public static final int height_Ball3 = (3*HEIGHT)/5;
    public static final int height_Ball4 = (4*HEIGHT)/5;

    public static final int speed_Ball1 = 1;
    public static final int speed_Ball2 = 2;
    public static final int speed_Ball3 = 3;
    public static final int speed_Ball4 = 4;

    int posX_Ball1 = 0;
    int posX_Ball2 = 0;
    int posX_Ball3 = 0;
    int posX_Ball4 = 0;


    public static void main(String[] args)
    {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {

        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();

    }

    private void drawBall1() {
        ellipse( posX_Ball1 , height_Ball1, DIAMETER, DIAMETER);
        posX_Ball1+= speed_Ball1;
    }

    private void drawBall2() {
        ellipse( posX_Ball2 , height_Ball2, DIAMETER,DIAMETER);
        posX_Ball2+= speed_Ball2;
    }

    private void drawBall3() {
        ellipse( posX_Ball3 , height_Ball3, DIAMETER,DIAMETER);
        posX_Ball3+= speed_Ball3;
    }

    private void drawBall4() {
        ellipse( posX_Ball4 , height_Ball4, DIAMETER,DIAMETER);
        posX_Ball4+= speed_Ball4;
    }

}
