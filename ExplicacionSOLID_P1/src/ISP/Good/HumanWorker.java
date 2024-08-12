package ISP.Good;

public class HumanWorker implements Worker,Eater{
    public void eat() {
        System.out.println("Tocó Comer...");
    }

    public void produce() {
        System.out.println("Nací para producidr...");
    }
}
