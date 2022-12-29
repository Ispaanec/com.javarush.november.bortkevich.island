public class Caterpillar extends Herbivorous {
    double weight;
    int maxSpeed;
    static double kgToFull = 0;
    static int population = 1000;

    static char symbol;

    public Caterpillar(double weight, int maxSpeed, double kgToFull, char symbol) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.kgToFull = kgToFull;
        this.symbol= symbol;
    }
}
