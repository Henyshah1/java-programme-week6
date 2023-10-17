package javaprogramme;

public class Programme_4_InstanceStatic {
    //declare two instance and two static variables
    int a = 20;
    int b = 40;
    static String name1 = "Java1";
    static String name2 = "Java2";
    //declare one instance method
    public void instanceMethod(){
        //call all four instance and static variables into the instance method inside the print statement
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("name1=" + name1);
        System.out.println("name2=" + name2);

    }
    //declare one static method
    public static void staticMethod(){
        //call all four instance and static variables into the static method inside the print statement
        Programme_4_InstanceStatic obj = new Programme_4_InstanceStatic();
        System.out.println("a=" + obj.a);
        System.out.println("b=" + obj.b);
        System.out.println("name1=" + name1);
        System.out.println("name2=" +name2);

    }
    //declare main method
    public static void main(String[] args) {
        Programme_4_InstanceStatic obj = new Programme_4_InstanceStatic();
        obj.instanceMethod();
        staticMethod();
    }
}
