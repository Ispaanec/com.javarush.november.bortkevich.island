import java.util.List;

public class Main {
    public static void main(String[] args) {
        Location location = new Location();
        double random = Math.random();
        List<? extends Animal> plantList = ListCreating.createListOfAnimal(new Plant (1,'*'), 200);
        List<? extends Animal> wolfList = ListCreating.createListOfAnimal(new Wolf(50,3,random+Wolf.kgToFull, 'W'), Wolf.population);
        List<? extends Animal> duckList = ListCreating.createListOfAnimal(new Duck(1,4,random+Duck.kgToFull, 'D'), Duck.population);
        List<? extends Animal> caterpillarList = ListCreating.createListOfAnimal(new Caterpillar(0.01,0,0,'|'), Caterpillar.population);

        System.out.println(EatChance.wolfEat(new Duck(1,4,random+Duck.kgToFull,'D')));
        System.out.println(EatChance.wolfEat(new Plant(1,'*')));
        System.out.println(EatChance.wolfEat(new Caterpillar(0.01,0,0,'|')));
// location.printIsland();
    }
}

/* 1. Сначала создаём карту.
2. Закидываем на карту всех животных по отдельности из списков.
3. Делаем проверку кто кого съедает. По принадлежности объекта к классу проходим через двойной цикл по всей 2D локе ?
3.1. Делаем проверку если объект того же класса находится на одной клетке то +1 объект того же класса
4. Все объекты на каждой клетке делают шаг в 1-3 клетки в рандомнуб соседнюю клетку (ChatGPJ уже рисовал код)
5. Снова проверка из шага 3 и 3.1
6. Попробовать добавить учёт голода животного
7. Попробовать добавить простую визуализацию
8. Добавляем многопоточность
*/

// нужно дописать шансы удачной/не удачной попытки съесть для каждого животного ( пока есть только волк )
// как реализовать метод успешного поедания
// добавить универсальный метод спаривания если на клетке объект того же класса
// подумать как можно реализовать метод перемещения
