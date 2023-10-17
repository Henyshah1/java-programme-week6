package javaprogramme;

public class Programme_16_AddBinary {
    public static void main(String[] args) {
        int a = Integer.parseInt(String.valueOf(10), 2);
        int b = Integer.parseInt(String.valueOf(11), 2);
        int sum = a + b;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}
