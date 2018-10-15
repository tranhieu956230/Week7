package Shape;

import java.util.ArrayList;

public class Hexagon extends Shape {
    private double width;

    public Hexagon(double width, String color, ArrayList<Point> ps) {
        super(color, ps);
        this.width = width;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    /**
     * @return Rectangle Perimeter
     */
    public double getPerimeter() {
        return (width) * 6;
    }

    /**
     * @return Rectangle Area
     */
    public double getArea() {
        return 3 * Math.sqrt(3) / 2 * width * width;
    }

    public boolean isDuplicate(Hexagon r) {
        boolean samePoint = true;

        for (int i = 0; i < getPoints().size(); i++) {
            if (getPoints().get(i).getXpos() != r.getPoints().get(i).getXpos() &&
                    getPoints().get(i).getYpos() != r.getPoints().get(i).getYpos()) {
                samePoint = false;
                break;
            }
        }
        if (getWidth() == r.getWidth() && samePoint) return true;
        return false;
    }
}
