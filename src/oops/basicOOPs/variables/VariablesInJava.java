package oops.basicOOPs.variables;
public class VariablesInJava {
    // Instance Variables - Reference Variables
    /*
    Two Choices
    1. Initialize with some predefined values
    2. If not, then they get their default data type values
     */
    int x;
    String name;
    boolean status;
    float f;
    char c;
    // Predefined value
    int value = 34;
    void show(){
        int m = 1; // Local Variable
    }
    static int p = 200;
    static String param = "High";
}
class Demo {
    public static void main(String[] args) {
        VariablesInJava obj = new VariablesInJava();
        System.out.println(obj.x);
        System.out.println(obj.name);
        System.out.println(obj.status);
        System.out.println(obj.f);
        System.out.println(obj.c);
        System.out.println(VariablesInJava.param);
    }
}
