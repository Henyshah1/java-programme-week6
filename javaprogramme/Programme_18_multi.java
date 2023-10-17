package javaprogramme;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide
 * remainder of two numbers
 */
public class Programme_18_multi {
    public static void main(String[] args) {
        int num1 = 125;
        int num2 = 24;
        int add = num1 + num2;
        int sub = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int rem = num1 % num2;
        System.out.println("125 + 24 = " + add);
        System.out.println("125 - 24 = " + sub);
        System.out.println("125 X 24 = " + multiply);
        System.out.println("125 / 24 = " + divide);
        System.out.println("125 mod 24 = " + rem);
    }
}
