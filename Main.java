package VictoriaSecreat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main extends Manager {
    public Main(int prize, int size, String name) {
    }

    public Main(String name, int prize, int size) {
        super(name, prize, size);
    }

    public static void main(String[] args) {
        List<Main> stuff = Arrays.asList(new Main(2, 2, "chmo"), new Main(3, 4, "popushcheniy"));
        stuff.sort(Comparator.comparing(Manager::getsize).thenComparing(Manager::getPrize));
        for (Manager manager : stuff) {
            System.out.println(manager);
        }
    }
}
