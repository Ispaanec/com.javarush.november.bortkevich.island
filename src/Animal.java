public abstract class Animal {
    double weight;
    static int population;
    int maxSpeed;
    double kgToFull;

    static char symbol;

    public Animal() {

    }

    public Animal(int population) {
        this.population = population;
    }

    public Animal(double weight, int population) {
        this.weight = weight;
        this.population = population;
    }

    public Animal(double weight, int maxSpeed, double kgToFull, char symbol) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.kgToFull = kgToFull;
        this.symbol = symbol;
    }

    public static char getSymbol() {
        return symbol;
    }

    public static void setSymbol(char symbol) {
        Animal.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", kgToFull=" + kgToFull +
                '}';
    }
}

