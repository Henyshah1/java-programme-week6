package javaprogramme;

public class Programme_19_Lowercase {
    public static void main(String[] args) {
        String Uppercase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String lowerCase = convertToLowerCase(Uppercase);
        System.out.println(lowerCase);
    }
    public static String convertToLowerCase(String input){
        return input.toLowerCase();
    }
}
