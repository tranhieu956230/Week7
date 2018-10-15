/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */

import Shape.*;

import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> arr;
    private boolean visible;

    public Layer(ArrayList<Shape> arr, boolean visible) {
        this.arr = arr;
        this.visible = visible;
    }

    public ArrayList<Shape> getShape() {
        return arr;
    }

    /**
     * Remove all the Triangle off the Layer
     */
    public void removeTriangle() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Triangle) {
                arr.remove(i);
                i--;
            }
        }
    }

    /**
     * Remove all the Circle off the Layer
     */
    public void removeCircle() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Circle) {
                arr.remove(i);
                i--;
            }
        }
    }

    /**
     * Print all Shape in the Layer
     */
    public void print() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    /**
     * Remove all duplicated shape
     */
    public void removeDuplicate() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Circle) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (((Circle) arr.get(j)).isDuplicate((Circle) arr.get(i))) {
                        arr.remove(j);
                        j--;
                        i--;
                    }
                }
            } else if (arr.get(i) instanceof Rectangle) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (((Rectangle) arr.get(j)).isDuplicate((Rectangle) arr.get(i))) {
                        arr.remove(j);
                        j--;
                        i--;
                    }
                }
            } else if (arr.get(i) instanceof Square) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (((Square) arr.get(j)).isDuplicate((Square) arr.get(i))) {
                        arr.remove(j);
                        j--;
                        i--;
                    }
                }
            } else if (arr.get(i) instanceof Triangle) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (((Triangle) arr.get(j)).isDuplicate((Triangle) arr.get(i))) {
                        arr.remove(j);
                        j--;
                        i--;
                    }
                }
            } else if (arr.get(i) instanceof Hexagon) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (((Hexagon) arr.get(j)).isDuplicate((Hexagon) arr.get(i))) {
                        arr.remove(j);
                        j--;
                        i--;
                    }
                }
            }
        }
    }

}
