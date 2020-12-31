import processing.core.PApplet;
public class Ball extends PApplet {

    public static  int speed_Ball;
    public static  int height_Ball;
    public static final int diameter = 10;
    private int posX_Ball = 0;

    public Ball(int speed_Ball, int height_Ball)
    {
        this.speed_Ball = speed_Ball;
        this.height_Ball = height_Ball;

    }

    public void drawBall() {
        ellipse( posX_Ball , height_Ball, diameter, diameter);
    }

    public void setPosX_Ball() {
        this.posX_Ball += speed_Ball;
    }
}
