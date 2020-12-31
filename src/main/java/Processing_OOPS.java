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
        PApplet.main("Processing_OOPS", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

            ball1 = new Ball(1,HEIGHT/5, 10);
            ball2 = new Ball(2,(2*HEIGHT)/5, 10);
            ball3 = new Ball(3,(3*HEIGHT)/5, 10);
            ball4 = new Ball(4,(4*HEIGHT)/5,10);
    }

    @Override
    public void draw() {

        drawInNextPos(ball1);
        drawInNextPos(ball2);
        drawInNextPos(ball3);
        drawInNextPos(ball4);

    }

    private void drawInNextPos(Ball ball) {

        // ball.drawBall(); --> error, why?
        ellipse( ball.getPosX_Ball() , ball.getHeight_Ball(), ball.getDiameter(), ball.getDiameter() );
        ball.setPosX_Ball();
    }


}
