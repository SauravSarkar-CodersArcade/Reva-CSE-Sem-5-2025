package oops.superKeyword;
class UISettings {
    String theme = "💡 Light Mode!";
}
class DashBoard extends UISettings {
    String theme = "🌚 Dark Mode!";
    void printTheme(){
        System.out.println("Child Theme: " + this.theme);
        System.out.println("Parent Theme: " + super.theme);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        new DashBoard().printTheme();
    }
}
