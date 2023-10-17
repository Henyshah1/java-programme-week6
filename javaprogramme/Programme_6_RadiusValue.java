package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area
 * .(Formula of Area A=PI*r*r).
 */
public class Programme_6_RadiusValue {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle = ");
        double radius = scanner.nextDouble();
        double area = calculateRadiusValue(radius);
        System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
        scanner.close();

    }

    public static double calculateRadiusValue(double radius){
        double pi = Math.PI;
        double area = pi * radius * radius;
        return area;
    }
}
