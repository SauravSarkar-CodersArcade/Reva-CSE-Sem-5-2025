package dateTimeExamples;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeDisplay {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date & Time before formatting: " + dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d, MM dd yyyy");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date Time: " + formattedDateTime);
        /*
        E -> Day of the week -> Mon to Sun
        d or dd -> Day of the month -> 1 to 31
        MM -> Month Number -> 1 to 12
        MMM -> Month Name -> Jan to Dec
        D -> Day of the year -> 1 to 366
         */
    }
}
