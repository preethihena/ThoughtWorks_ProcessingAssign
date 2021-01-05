import processing.core.PApplet;

public class Ball extends PApplet {

    private int speedOfBall;
    private int heightOfBall;
    private static int diameterOfBall;
    private int positionOfBall = 0;

    public Ball(int speedOfBall, int heightOfBall, int diameterOfBall) {
        this.speedOfBall = speedOfBall;
        this.heightOfBall = heightOfBall;
        this.diameterOfBall = diameterOfBall;

    }

//    public void drawBall() {
//        ellipse( positionOfBall , heightOfBall, diameterOfBall, diameterOfBall);
//    }


    public int getHeightOfBall() {
        return heightOfBall;
    }

    public static int getDiameterOfBall() {
        return diameterOfBall;
    }

    public int getPositionOfBall() {
        return positionOfBall;
    }

    public void setPositionOfBall() {
        this.positionOfBall += speedOfBall;
    }

}
