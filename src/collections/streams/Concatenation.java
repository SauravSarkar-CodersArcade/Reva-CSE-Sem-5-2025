package collections.streams;

import java.util.stream.Stream;
public class Concatenation {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of
                ("Reva", "University", "CSE", "2025");
//        String data = stringStream.reduce("", (a,b) -> a+b);
//        System.out.println(data);
        String concatenated = stringStream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append).toString();
        System.out.println(concatenated);
    }
}
