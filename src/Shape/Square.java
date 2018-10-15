/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Square extends Rectangle {
    public Square(double side, ArrayList<Point> ps) {
        super(side, side, "red", ps);
    }

    public boolean isDuplicate(Square s) {
        boolean samePoint = true;

        for (int i = 0; i < getPoints().size(); i++) {
            if (getPoints().get(i).getXpos() != s.getPoints().get(i).getXpos() &&
                    getPoints().get(i).getYpos() != s.getPoints().get(i).getYpos()) {
                samePoint = false;
                break;
            }
        }
        if (getWidth() == s.getWidth() && samePoint) return true;
        return false;
    }
}
