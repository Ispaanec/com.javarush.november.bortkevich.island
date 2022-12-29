public class Plant extends Herbivorous {
    double weight;
    static int population = 200;

    static char symbol;

    public Plant(double weight, char symbol) {
        this.weight = weight;
        this.symbol = symbol;
    }
}
