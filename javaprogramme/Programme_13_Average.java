package javaprogramme;
/**
 * Write a Java program that takes three numbers as input to calculate
 * print the average of the numbers
 */

import java.util.Scanner;

public class Programme_13_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double a = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double b = scanner.nextDouble();
        System.out.println("Enter number 3: ");
        double c = scanner.nextDouble();
        double average = calculateAverage(a,b,c);
        System.out.println("The average of the three numbers is: " + average);
        scanner.close();
    }
    public static double calculateAverage(double a, double b, double c){
        return (a + b + c) / 3.0;
    }
}
