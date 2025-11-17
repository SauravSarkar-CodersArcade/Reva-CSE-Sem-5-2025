package dateTimeExamples;

import java.time.LocalDate;

public class DisplayDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().minusDays(5);
        System.out.println("Today's date: " + date);
    }
}
