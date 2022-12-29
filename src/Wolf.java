public class Wolf extends Predator {
    double weight;
    int maxSpeed;
    static double kgToFull = 8;
    static int population = 30;

    static char symbol;

    public Wolf(double weight, int maxSpeed, double kgToFull, char symbol) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.kgToFull = kgToFull;
        this.symbol = symbol;
    }
}
