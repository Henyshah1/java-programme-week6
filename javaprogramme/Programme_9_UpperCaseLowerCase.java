package javaprogramme;

import java.util.Scanner;

public class Programme_9_UpperCaseLowerCase {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in uppercase: ");
        String uppercaseInput = scanner.nextLine();
        String lowercaseOutput = convertToLowerCase(uppercaseInput);
        System.out.println("Converted to lowercase: " + lowercaseOutput);
        scanner.close();
    }
    public static String convertToLowerCase(String input) {
        return input.toLowerCase();
    }
}
