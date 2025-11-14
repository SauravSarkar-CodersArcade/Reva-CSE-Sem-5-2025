package oops.basicOOPs;
public class FinalKeyword {
    {
        System.out.println("Instance Initializer Block - IIB 2");
    }
    final int x;
    static final int y;
    FinalKeyword(){
        x = 200;
    }
    static { // This block is used to initialize resources in Java
        y = 100;
        System.out.println("Vijay is sitting in the first bench!");
    }
    public static void main(String[] args) {
        new FinalKeyword();
    }
    {
        System.out.println("Instance Initializer Block - IIB 1");
    }
}
