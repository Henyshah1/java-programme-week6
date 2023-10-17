package javaprogramme;
/**
 * Write a program to insert any temperature value in degree
 * Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme_7_Temperature {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the tempreature in fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = convertToFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°c");
        scanner.close();
    }
    public static double convertToFahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }
}
