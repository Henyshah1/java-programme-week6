package javaprogramme;

public class Programme_17_BinaryNum {
    public static void main(String[] args) {
        int a = 5;
        String binaryNumber = convertToBinary(a);
        System.out.println("Binary number is: " + binaryNumber);
    }
    public static String convertToBinary(int a){
        return Integer.toBinaryString(a);
    }
}
