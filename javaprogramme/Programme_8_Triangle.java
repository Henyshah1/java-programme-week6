package javaprogramme;

import java.util.Scanner;

public class Programme_8_Triangle {
       //main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        //print statment
            System.out.print("Enter the length of A: ");
            double A = scanner.nextDouble();

            System.out.print("Enter the length of B: ");
            double B = scanner.nextDouble();

            System.out.print("Enter the length of C: ");
            double C = scanner.nextDouble();

            double area = calculateTriangleArea(A, B, C);

            if (area >= 0) {
                System.out.println("The area of the triangle is: " + area);
            } else {
                System.out.println("Invalid triangle sides. Cannot calculate the area.");
            }

            scanner.close();
        }

        public static double calculateTriangleArea(double a, double b, double c) {


            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
        }
    }


