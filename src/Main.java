public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(args[0]);
        double d = 2.56;
        float f = 12.67F;
        System.out.println("INT_MAX: " + Integer.MAX_VALUE);
        System.out.println("INT_MIN: " + Integer.MIN_VALUE);
        System.out.println("INT_MAX + 1: " + (Integer.MAX_VALUE + 1));
        System.out.println("INT_MIN - 1: " + (Integer.MIN_VALUE - 1));
        int a = 20;
        int b = 30;
        System.out.println(++a + ++b);
        System.out.println("a = " + a + " b = " + b);
        boolean result = (2 > 3) ? true : false;
        System.out.println(result);
        String op = (10 < 20) ? "Yes" : "No";
        System.out.println(op);
    }
}