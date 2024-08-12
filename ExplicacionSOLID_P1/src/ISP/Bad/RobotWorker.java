package ISP.Bad;

public class RobotWorker implements Worker{
    public void produce() {
        System.out.println("Produzco.");
    }

    public void eat() {
    throw new UnsupportedOperationException("¿Queseso?");
    }
}
