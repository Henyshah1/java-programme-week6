package javaprogramme;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters
 * use string concatenation methods
 * (Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {
    public static void main(String[] args) {
        Programme_5_Calculator calculator = new Programme_5_Calculator();

        // Static method calls
        System.out.println("Addition: " + Programme_5_Calculator.add(5, 10));
        System.out.println("Subtraction: " + Programme_5_Calculator.subtract(5, 10));

        // Instance method calls
        System.out.println("Multiplication: " + Programme_5_Calculator.multiply(5, 10));
        System.out.println("Division: " + Programme_5_Calculator.divide(6, 10));
    }

    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method for subtraction
    public static int subtract(int a, int b) {
        return a - b;

    }

    // Instance method for multiplication
    public static String multiply(int a, int b) {
        int result = a * b;
        return "Result of " + a + " * " + b + " is " + result;
    }

    // Instance method for division
    public static String divide(int a, int b) {
        int result = a / b;
        return "Result of " + a + " / " + b + " is " + result;
    }

}








