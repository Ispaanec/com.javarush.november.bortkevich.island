import java.util.List;
import java.util.Random;

public class Location {
    private static final int SIZE = 100;
    public Object[][] grid = new Object[SIZE][SIZE];
    private final Random random = new Random();

    public Location() {
// инициализируем карту пустыми символами
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    // попробовал создать универсальный метод для добавления животных на локацию
// подаётся список животных и их популяция.
    public void addAnimalOnLocation(List<? extends Animal> difAnimals) {
        for (Animal animal : difAnimals) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            grid[x][y] = animal.toString();
        }
    }


    public void initPlants() {
// добавляем растения в случайные места
        for (int i = 0; i < Plant.population; i++) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            grid[x][y] = Plant.symbol;
        }
    }
/*
public void initCaterpillar() {
// добавляем гусеницы в случайные места
for (int i = 0; i < Caterpillar.population; i++) {
int x = random.nextInt(SIZE);
int y = random.nextInt(SIZE);
if (grid[x][y] == Plant.plantSymbol) {
// если гусеница попала на растение, то съедаем его
grid[x][y] = Caterpillar.caterpillarSymbol;
} else {
grid[x][y] = Caterpillar.caterpillarSymbol;
}
}
}

public void initDucks() {
//добавляем утки в случайные места
for (int i = 0; i < Duck.population; i++) {
int x = random.nextInt(SIZE);
int y = random.nextInt(SIZE);
if (grid[x][y] == Caterpillar.caterpillarSymbol && random.nextInt(100) < 90) {
// утка с шансом 90% съедает гусеницу
grid[x][y] = Duck.duckSymbol;
} else if (grid[x][y] == Caterpillar.caterpillarSymbol) {
// утка всегда съедает растение
grid[x][y] = Duck.duckSymbol;
}
}
}

public void initWolf() {
for (int i = 0; i < Wolf.population; i++) {
int x = random.nextInt(SIZE);
int y = random.nextInt(SIZE);
if (grid[x][y] == Duck.duckSymbol && random.nextInt(100) < 60) {
grid[x][y] = Wolf.wolfSymbol;
}
}
} */

    // метод ниже просто визуализирует 2D локацию.
    public void printIsland() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
