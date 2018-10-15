/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */

import Shape.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle("blue", generateCirclePoints(), 10);
        Shape t = new Triangle("red", generateTrianglePoints());
        Shape r = new Rectangle(100, 40, "green", generateRectanglePoints());
        Shape s = new Square(100, generateSquarePoints());

        ArrayList<Layer> layers = new ArrayList<Layer>();
        ArrayList<Shape> shapes1 = new ArrayList<Shape>();
        ArrayList<Shape> shapes2 = new ArrayList<Shape>();

        shapes1.add(c);
        shapes1.add(t);
        shapes1.add(r);
        shapes1.add(s);

        shapes2.add(c);
        shapes2.add(t);
        shapes2.add(r);
        shapes2.add(s);
        shapes2.add(t);
        shapes2.add(c);

        layers.add(new Layer(shapes1));
        layers.add(new Layer(shapes2));

        Diagram diagram = new Diagram(layers);
        System.out.println("Before Remove");
        diagram.print();
        diagram.removeCircle();
        layers.get(0).removeTriangle();
        layers.get(1).removeTriangle();
        System.out.println("---------------------");
        System.out.println("After Remove");
        diagram.print();


    }


    public static ArrayList<Point> generateCirclePoints() {
        ArrayList<Point> result = new ArrayList<Point>();
        result.add(new Point(Math.random() * 10, Math.random() * 10));
        return result;
    }

    public static ArrayList<Point> generateTrianglePoints() {
        ArrayList<Point> result = new ArrayList<Point>();
        for (int i = 0; i < 3; i++) {
            result.add(new Point(Math.random() * 10, Math.random() * 10));
        }
        return result;
    }

    public static ArrayList<Point> generateRectanglePoints() {
        ArrayList<Point> result = new ArrayList<Point>();
        for (int i = 0; i < 4; i++) {
            result.add(new Point(Math.random() * 10, Math.random() * 10));
        }
        return result;
    }

    public static ArrayList<Point> generateSquarePoints() {
        ArrayList<Point> result = new ArrayList<Point>();
        for (int i = 0; i < 4; i++) {
            result.add(new Point(Math.random() * 10, Math.random() * 10));
        }
        return result;

    }
}
