package oops.superKeyword;
class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    double calculateSalary(){
        return baseSalary;
    }
}
class Manager extends Employee {
    double bonus;
    Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
public class Demo {
    public static void main(String[] args) {
        Manager m = new Manager("Saurav", 50000, 15000);
        System.out.println(m.calculateSalary());
    }
}
