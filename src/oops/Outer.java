package oops;
public class Outer {
    private int value = 10;
    class Inner {
        void display(){
            System.out.println("Value is: " + value);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
