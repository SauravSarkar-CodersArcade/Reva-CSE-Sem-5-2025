package oops.basicOOPs;
public class Student {
    String name;
    int age;
    String email;
    static String college = "Reva";
    public Student(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Vijay", 20, "vijay@gmail.com");
        Student s2 = new Student("Sahana", 19, "sahana@gmail.com");
    }
}
