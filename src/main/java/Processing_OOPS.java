import processing.core.PApplet;
 public class Processing_OOPS extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 360;
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

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

        drawInNextPos(ball1);
        drawInNextPos(ball2);
        drawInNextPos(ball3);
        drawInNextPos(ball4);


    }

    private void drawInNextPos(Ball ball) {
        ball.drawBall();
        ball.setPosX_Ball();
    }


}
