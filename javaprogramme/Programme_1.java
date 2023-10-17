package javaprogramme;

public class Programme_1 {
    //two instance variables
    int a = 10;
    String name = "Java";

    //one instance method
    public void printInstanceVariable(){

        System.out.println("a:" + a);
        System.out.println("name:" + name);
    }
    //declare main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        obj.printInstanceVariable();
    }
}
