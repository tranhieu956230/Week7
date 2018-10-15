/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
import Shape.*;

import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> arr;

    public Diagram(ArrayList<Layer> arr) {
        this.arr = arr;
    }

    /**
     * Remove all the Circle instance off the Diagram
     */
    public void removeCircle() {
        for(int i = 0; i < arr.size(); i++) {
            arr.get(i).removeCircle();
        }
    }

    /**
     * Print all Shape of the Diagram
     */
    public void print() {
        for(int i = 0; i < arr.size(); i++) {
            arr.get(i).print();
            System.out.println();
        }
    }
    // Layer 0 for Circle
    // Layer 1 for Rectangle
    // Layer 2 for Square
    // Layer 3 for Triangle
    // Layer 4 for Hexagon

    public void classifyShape() {
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0;j < arr.get(i).getShape().size(); j++) {
                if(arr.get(i).getShape().get(j) instanceof Circle) arr.get(0).getShape().add(arr.get(i).getShape().get(j));
                if(arr.get(i).getShape().get(j) instanceof Rectangle) arr.get(1).getShape().add(arr.get(i).getShape().get(j));
                if(arr.get(i).getShape().get(j) instanceof Square) arr.get(2).getShape().add(arr.get(i).getShape().get(j));
                if(arr.get(i).getShape().get(j) instanceof Triangle) arr.get(3).getShape().add(arr.get(i).getShape().get(j));
                if(arr.get(i).getShape().get(j) instanceof Hexagon) arr.get(4).getShape().add(arr.get(i).getShape().get(j));
            }
        }
    }


}
