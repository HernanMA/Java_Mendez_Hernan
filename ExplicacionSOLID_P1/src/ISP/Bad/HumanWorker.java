package ISP.Bad;

public class HumanWorker implements Worker{

    public void produce() {
        System.out.println("Estoy produciendo");
    }


    public void eat() {
        System.out.println("Me tocó comer...");
    }
}
