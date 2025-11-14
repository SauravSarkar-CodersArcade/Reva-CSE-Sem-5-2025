package oops.inheritance.single;
public class PowerUp {
    void show(){
        System.out.println("This is a Game.");
    }
    void activate(){
        System.out.println("Power-Up activated!");
    }
}
class SpeedBoost extends PowerUp{
    @Override
    void activate(){
        System.out.println("⚡️ Speed Boost Activated for 5 Seconds!");
    }
}
class Shield extends PowerUp {
    @Override
    void activate(){
        System.out.println("🛡️ Shield activated for 10 Seconds");
    }
}
class GameDemo {
    public static void main(String[] args) {
        PowerUp p1 = new SpeedBoost();
        PowerUp p2 = new Shield();
        p1.show();
        p2.show();
        p1.activate();
        p2.activate();
    }
}
