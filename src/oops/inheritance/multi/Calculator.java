package oops.inheritance.multi;
public class Calculator {
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class SimpleCalculator extends Calculator{
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class AdvCalculator extends SimpleCalculator {
    void product(int a, int b){
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(1,2);
        System.out.println("======================");
        SimpleCalculator c2 = new SimpleCalculator();
        c2.add(1,2);
        c2.subtract(10,5);
        System.out.println("======================");
        AdvCalculator c3 = new AdvCalculator();
        c3.add(1,2);
        c3.subtract(10,20);
        c3.product(10,3);
        System.out.println("======================");
    }
}
