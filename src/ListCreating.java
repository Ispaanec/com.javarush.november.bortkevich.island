import java.util.ArrayList;
import java.util.List;

public interface ListCreating {
    //мы подаём в метод новый объект-наследник от Животного популяцию этого вида животного и получаем список.
    static List<? extends Animal> createListOfAnimal(Animal animal, int population) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < population; i++) {
            animals.add(animal);
        }
        return animals;
    }
}
