package VictoriaSecreat;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
public class Manager {
    private String name;
    private int prize;
    private int size;

    public Manager(String name, int prize, int size) {
        this.name = name;
        this.prize= prize;
        this.size = size;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }
    public int getsize() {
        return size;
    }
    public int getPrize() {
        return prize;
    }
    public static void main(String[] args) {
        List<Manager> stuff = Arrays.asList(new Manager("chmo", 2,2 ), new Manager("popushcheniy", 4,3 ));
        stuff.sort(Comparator.comparing(Manager::getsize).thenComparing(Manager::getPrize));
        for (Manager manager : stuff) {
            System.out.println(manager.toString());
        }
    }
}




