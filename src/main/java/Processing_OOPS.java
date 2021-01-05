import processing.core.PApplet;

public class Processing_OOPS extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 360;

    Ball processingBalls[] = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("Processing_OOPS", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

        processingBalls[0] = new Ball(1, HEIGHT / 5, 10);
        processingBalls[1] = new Ball(2, (2 * HEIGHT) / 5, 10);
        processingBalls[2] = new Ball(3, (3 * HEIGHT) / 5, 10);
        processingBalls[3] = new Ball(4, (4 * HEIGHT) / 5, 10);
    }

    @Override
    public void draw() {

        for (int indexOfBall = 0; indexOfBall < 4; indexOfBall++) {
            drawInNextPos(processingBalls[indexOfBall]);
        }

    }

    private void drawInNextPos(Ball ball) {

        // ball.drawBall(); --> error, why?
        ellipse(ball.getPositionOfBall(), ball.getHeightOfBall(), ball.getDiameterOfBall(), ball.getDiameterOfBall());
        ball.setPositionOfBall();
    }


}
