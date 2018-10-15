/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;

    public Circle(String color, ArrayList<Point> ps, double radius) {
        super(color, ps);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return Circle's Perimeter
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }


    /**
     * @return Circle's Area
     */
    public double getArea() {
        return 2 * PI * radius * radius;
    }

    /**
     * @param c Circle instance
     * @return whether two Circle is duplicated
     */
    public boolean isDuplicate(Circle c) {
        boolean samePoint = true;

        for (int i = 0; i < getPoints().size(); i++) {
            if (getPoints().get(i).getXpos() != c.getPoints().get(i).getXpos() &&
                getPoints().get(i).getYpos() != c.getPoints().get(i).getYpos()) {
                    samePoint = false;
                    break;
            }
        }
        if (this.radius == c.radius && samePoint) return true;
        return false;
    }
}
