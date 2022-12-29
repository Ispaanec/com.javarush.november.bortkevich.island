import java.util.Random;

public class EatChance {
    static Random random = new Random();

    public static boolean wolfEat(Animal animal) {
        if (animal instanceof Duck) {
            return random.nextInt(100) < 40;
        } else return false;
    }

    public static boolean duckEatChance(Animal animal) {
        if (animal instanceof Caterpillar) {
            return random.nextInt(100) < 90;
        } else if (animal instanceof Plant) {
            return true;
        } else return false;
    }

    public static boolean CaterpillarEatChance(Animal animal) {
        if (animal instanceof Plant) {
            return true;
        } else return false;
    }
}
