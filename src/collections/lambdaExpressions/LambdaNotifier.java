package collections.lambdaExpressions;
@FunctionalInterface
interface Notifier {
    void send(String msg);
}
public class LambdaNotifier {
    public static void main(String[] args) {
        Notifier n = (msg) ->
                System.out.println("🔔 Notification: " + msg);
        n.send("Welcome Akarsh!");
    }
}
