/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Shape {
    private String color;
    private ArrayList<Point> p;
    public Shape(String color, ArrayList<Point> ps) {
        this.color = color;
        this.p = ps;
    }

    public ArrayList<Point> getPoints() {return this.p;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {return 0;}

    /**
     * Move the Shape
     * @param xVelocity moving speed along the x-axis
     * @param yVelocity moving speed along the y-axis
     */
    public void move(double xVelocity, double yVelocity) {
        for(int i = 0; i< p.size(); i++) {
            p.get(i).move(xVelocity, yVelocity);
        }
    }
}
