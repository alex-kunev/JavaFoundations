package Lesson04Methods;

import java.util.Scanner;

public class rectangleArea {
    //Create a method which returns rectangle area with given width and height
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        
        System.out.println("Area of rectangle is: " + rectangleArea(width, height));
        
    }

    private static int rectangleArea(int width, int height) {
        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);
        return width*height;
    }
}
