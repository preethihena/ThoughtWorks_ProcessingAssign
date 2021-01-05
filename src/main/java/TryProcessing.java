import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 360;
    public static final int DIAMETER = 10;


    int heightOfBall[] = {HEIGHT / 5, (2 * HEIGHT) / 5, (3 * HEIGHT) / 5, (4 * HEIGHT) / 5};
    int speedOfBall[] = {1, 2, 3, 4};
    int positionOfBall[] = {0, 0, 0, 0};


    public static void main(String[] args) {
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

        for (int indexOfBall = 0; indexOfBall < 4; indexOfBall++) {
            drawBall(indexOfBall);
        }

    }

    private void drawBall(int indexOfBall) {
        ellipse(positionOfBall[indexOfBall], heightOfBall[indexOfBall], DIAMETER, DIAMETER);
        positionOfBall[indexOfBall] += speedOfBall[indexOfBall];
    }


}
