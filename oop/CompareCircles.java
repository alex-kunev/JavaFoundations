package oop;

import java.util.HashMap;
import java.util.Scanner;

abstract class CircleNew implements Comparable<Circle> {
    private double radius;
    private int id;

    private static int LastId = 0;

    public CircleNew (double radius, int id) {
        this.radius = radius;
        this.id = ++LastId;
    }

    public CircleNew(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(
                "Circle #%d (radius=%.2f)",
                this.id, this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CircleNew)) {
            return false;
        } else {
            CircleNew otherCircle = (CircleNew) obj;
            return this.radius == otherCircle.radius;
        }
    }

    @Override
    public int compareTo(CircleNew o) {
        return Double.compare(this.radius, o.radius);
    }
}

public class CompareCircles {

    public static void main(String[] args) {
//        Circle c1 = new Circle(15);
//        Circle c2 = new Circle(15);
//        System.out.println("c1 = c2? " + c1.equals(c2));
//        //returns false, until method equals() is overwritten
//        System.out.println("delta".compareTo("bob"));
//        //retuns 2
//        System.out.println("lionel".compareTo("bob"));
//        //return 10

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, CircleNew> circles = new HashMap<>();

        while(true) {
            String cmdLine = sc.nextLine();
            if (cmdLine.equals("stop")) {
                break;
            }
            String[] parts = cmdLine.split(" ");
            if (parts[0].equals("circle")) {
                double radius = Double.parseDouble(parts[1]);
                CircleNew c1 = new CircleNew (radius);
                circles.put(c1.getId(), c1);
            } else if (parts[0].equals("compare")) {
                int compare1 = Integer.parseInt(parts[1]);
                int compare2 = Integer.parseInt(parts[1]);
                CircleNew circle1 = circles.get(compare1);
                CircleNew circle2 = circles.get(compare2);
                int compareResult = circle1.compareTo(circle2);
                System.out.printf("Circle #%d #s Circle #%d",
                        circle1.getId(), getSign(compareResult), circle2.getId());
            }
        }


    }

    private static Object getSign(int compareResult) {
        if (compareResult < 0) {
            return "<";
        }
        if (compareResult > 0) {
            return ">";
        } else {
            return "=";
        }
    }
}
