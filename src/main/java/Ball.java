import processing.core.PApplet;
public class Ball extends PApplet {

    private  int speed_Ball;
    private  int height_Ball;
    private static int diameter ;
    private int posX_Ball = 0;

    public Ball(int speed_Ball, int height_Ball, int diameter) {
        this.speed_Ball = speed_Ball;
        this.height_Ball = height_Ball;
        this.diameter = diameter;

    }

//    public void drawBall() {
//        ellipse( posX_Ball , height_Ball, diameter, diameter);
//    }

    public  int getSpeed_Ball() {
        return speed_Ball;
    }
    public void setSpeed_Ball(int speed_Ball) {
        this.speed_Ball = speed_Ball;
    }

    public  int getHeight_Ball() {
        return height_Ball;
    }
    public void setHeight_Ball(int height_Ball) {
        this.height_Ball = height_Ball;
    }

    public static int getDiameter() {
        return diameter;
    }
    public static void setDiameter(int diameter) {
        Ball.diameter = diameter;
    }

    public int getPosX_Ball() {
        return posX_Ball;
    }
    public void setPosX_Ball() {
        this.posX_Ball += speed_Ball;
    }

}
