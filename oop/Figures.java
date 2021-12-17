package oop;

import java.util.ArrayList;
import java.util.Scanner;

interface Movable{
    public void move(int deltaX, int deltaY);
}

abstract class Figure implements Movable {
    protected int x, y;
    //declared protected to be accessible from child class


    public Figure() {
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public abstract double calcArea();

}

class Rectangle extends Figure {
    protected double width, height;

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
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

    @Override
    public double calcArea() {
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangle(width=%.2f, height=%.2f, area=%.2f)",
                this.width, this.height, this.calcArea());
    }
}

class Circle extends Figure implements Comparable<Circle> {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle(radius=%.2f, area=%.2f)",
                this.radius, this.calcArea());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        } else {
            Circle otherCircle = (Circle) obj;
            return this.radius == otherCircle.radius;
        }
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }
}

class FilledRectangle extends Rectangle {
    private String color;

    public FilledRectangle(double width, double height, String color) {
        super(width, height);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "FilledRectangle(width=%.2f, height=%.2f, color=%.2s, area=%" +
                        ".2f)",
                this.width, this.height, this.color, this.calcArea());
    }
}


public class Figures {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(25, 30);
//        System.out.println(rectangle1);
//
//        Circle circle1 = new Circle(24);
//        System.out.println(circle1);
        ArrayList<Figure> figures = readFigures();

        figures.sort((f1, f2) -> Double.compare(f1.calcArea(), f2.calcArea()));

        printFigures(figures);

    }

    private static void printFigures(ArrayList<Figure> figures) {
        for (var f : figures) {
            System.out.println(f);
        }
    }

    private static ArrayList<Figure> readFigures() {
        ArrayList<Figure> figures = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String cmdLine = sc.nextLine();
            if (cmdLine.equals("stop")) {
                break;
            }
            String[] parts = cmdLine.split(" ");
            if (parts[0].equals("circle")) {
                double radius = Double.parseDouble(parts[1]);
                figures.add(new Circle(radius));
            } else if (parts[0].equals("rect")) {
                double width = Double.parseDouble(parts[1]);
                double height = Double.parseDouble(parts[2]);
                figures.add(new Rectangle(width, height));
            } else if (parts[0].equals("filledRect")) {
                double width = Double.parseDouble(parts[1]);
                double height = Double.parseDouble(parts[2]);
                String color = parts[3];
                figures.add(new FilledRectangle(width, height, color));
            } else {
                System.out.println("Unknown command " + cmdLine);
            }
        }
        return figures;
    }
}
