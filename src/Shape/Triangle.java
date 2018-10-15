/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Triangle extends Shape {
    public Triangle(String color, ArrayList<Point> ps) {
        super(color, ps);
    }

    public boolean isDuplicate(Triangle t) {
        boolean samePoint = true;

        for (int i = 0; i < getPoints().size(); i++) {
            if (getPoints().get(i).getXpos() != t.getPoints().get(i).getXpos() &&
                    getPoints().get(i).getYpos() != t.getPoints().get(i).getYpos()) {
                samePoint = false;
                break;
            }
        }
        if (samePoint) return true;
        return false;
    }

}
