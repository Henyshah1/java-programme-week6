package javaprogramme;

public class Programme_3_InstanceStatic {
    //declare one instance and one static variable
    int a = 10;
    static String name = "Java";
    //declare one instance method
    public void instanceMethod(){
        System.out.println("a=" + a);
        System.out.println("name=" + name);

    }
    //declare one static method
    public static void staticMethod(){
        Programme_3_InstanceStatic obj = new Programme_3_InstanceStatic();
        System.out.println("a=" + obj.a);
        System.out.println("name=" + name);
    }
    //declare main method
    public static void main(String[] args) {
        Programme_3_InstanceStatic obj = new Programme_3_InstanceStatic();
        obj.staticMethod();
        staticMethod();
    }
}
