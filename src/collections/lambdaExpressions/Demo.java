package collections.lambdaExpressions;
public interface Demo {
    void function();
}
class ABC {
    public static void main(String[] args) {
        // Java 8 ->
        // Boilerplate Code
        Demo obj = new Demo() {
            public void function() {
                System.out.println("Boilerplate Code.");
            }
        };
        obj.function();
        // Scala Inspired Code: One-Liners
        Demo obj1 = () -> System.out.println("Scala Inspired Code.");
        obj1.function();
    }
}

