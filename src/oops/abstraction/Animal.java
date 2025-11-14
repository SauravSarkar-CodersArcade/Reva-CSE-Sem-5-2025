package oops.abstraction;

public interface Animal {
    void speed();
    void sound();
}
class Cheetah implements Animal{

    @Override
    public void speed() {
        System.out.println("Cheetah: High Speed Animal");
    }

    @Override
    public void sound() {
        System.out.println("Cheetah makes very little sound!");
    }

    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        c.speed();
        c.sound();
    }
}
