package DIP.Good;

public class LightBulb implements Switchable{

    public void turnOn() {
        System.out.println("Me prendi...");
    }


    public void turnOff() {
        System.out.println("Me apague...");
    }
}
