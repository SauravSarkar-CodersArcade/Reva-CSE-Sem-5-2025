package oops.abstraction;
abstract class Notification {
    // Normal or Concrete Method
    void showIntro(){
        System.out.println("======== Coders Arcade Chat App ==========");
    }
    // Abstract Method -> Should Be Implemented In the Child Classes
    abstract void send(String message);
}
class Email extends Notification {
    @Override
    void send(String message) {
        System.out.println("📧 Email Sent: " + message);
    }
}
class Push extends Notification{
    @Override
    void send(String message) {
        System.out.println("🔔 Push Notification: " + message);
    }
}
class SMS extends Notification{
    @Override
    void send(String message) {
        System.out.println("📺 SMS: " + message);
    }
}
class NotifyDemo{
    public static void main(String[] args) {
        Notification[] list = {new Email(), new SMS(), new Push()};
        for(Notification n : list){
            n.send("Server is down!");
        }
    }
}
