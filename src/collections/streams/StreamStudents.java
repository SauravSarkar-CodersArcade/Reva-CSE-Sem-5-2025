package collections.streams;

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;
    public Student(String n, int s){
        name = n;  score = s;
    }
}
public class StreamStudents {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Aarav", 92),
                new Student("Sharanya", 85),
                new Student("Kiran", 98)
        );
        list.stream()
                .filter(s -> s.score > 90)
                .sorted((a,b) -> b.score - a.score)
                .forEach(s -> System.out.println(s.name + " " + s.score));
    }
}
