package dateTimeExamples;

import java.time.LocalTime;

public class DisplayTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
    }
}
