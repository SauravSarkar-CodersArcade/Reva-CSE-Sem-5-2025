package oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Raman");
        e1.setSalary(35000);
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
    }
}
