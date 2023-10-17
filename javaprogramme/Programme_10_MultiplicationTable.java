package javaprogramme;
/**
 * Write a Java program that takes a number as input
 * prints its multiplication table up to 10.
 */

import java.util.Scanner;

public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = scanner.nextInt();
        System.out.println("Multiplication table for " + a + ":");
        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.println(a + " x " + i + " = " + result);
        }
        scanner.close();
    }
}
