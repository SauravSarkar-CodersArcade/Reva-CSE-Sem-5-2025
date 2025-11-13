import java.util.Scanner;
public class YieldKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String typeOfDay = switch (day){
            case "MON", "TUE", "WED", "THU", "FRI" -> "WEEKDAY";
            case "SAT", "SUN" -> "WEEKEND";
            default -> {
                if(day.isEmpty()){
                    yield "Sorry! No data given.";
                }else {
                    yield "Invalid Data";
                }
            }
        };
        System.out.println("The type of day is: " + typeOfDay);
    }
}
