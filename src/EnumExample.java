enum Houses {
    RED, BLUE, GREEN, YELLOW
}
public class EnumExample {
    public static void main(String[] args) {
        Houses house = Houses.BLUE;
        System.out.println("The house is: " + house);
        for(Object obj : Houses.values()){
            System.out.print(obj + " ");
        }
    }
}
