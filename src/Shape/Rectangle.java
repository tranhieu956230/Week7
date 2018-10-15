/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double with, double length, String color, ArrayList<Point> ps) {
        super(color, ps);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return Rectangle Perimeter
     */
    public double getPerimeter() {
        return (width + height) * 2;
    }

    /**
     * @return Rectangle Area
     */
    public double getArea() {
        return width * height;
    }

    public boolean isDuplicate(Rectangle r) {
        boolean samePoint = true;

        for (int i = 0; i < getPoints().size(); i++) {
            if (getPoints().get(i).getXpos() != r.getPoints().get(i).getXpos() &&
                    getPoints().get(i).getYpos() != r.getPoints().get(i).getYpos()) {
                samePoint = false;
                break;
            }
        }
        if (getWidth() == r.getWidth() && getHeight() == r.getHeight() && samePoint) return true;
        return false;
    }
}
