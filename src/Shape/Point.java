/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

public class Point {
    private double xpos, ypos;

    public Point(double x, double y) {
        this.xpos = x;
        this.ypos = y;
    }

    public double getXpos() {
        return xpos;
    }

    public void setXpos(double xpos) {
        this.xpos = xpos;
    }

    public double getYpos() {
        return ypos;
    }

    public void setYpos(double ypos) {
        this.ypos = ypos;
    }

    /**
     * Move the point
     * @param xVel double moving speed x-axis
     * @param yVel double mvoing speed y-axis
     */
    public void move(double xVel, double yVel) {
        this.xpos += xVel;
        this.ypos += yVel;
    }
}
