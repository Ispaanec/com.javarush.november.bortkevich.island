public class Duck extends Herbivorous {
    double weight;
    int maxSpeed;
    static double kgToFull = 0.15;
    static int population = 200;
    static char symbol;

    public Duck(double weight, int maxSpeed, double kgToFull, char symbol) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.kgToFull = kgToFull;
        this.symbol = symbol;
    }
}
