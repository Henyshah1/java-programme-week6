package javaprogramme;

public class Programme_2_StaticVariable {
    //declare two static method
    static int a = 10;
    static String name = "Java";

    //declare one static method
    public static void printStaticVariables(){
        System.out.println("a=" + a);
        System.out.println("name=" + name);

    }
    //declare main method
    public static void main(String[] args) {
        printStaticVariables();

    }
}
