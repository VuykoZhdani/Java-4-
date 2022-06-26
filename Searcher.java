package VictoriaSecreat;

import java.util.List;

public class Searcher {
    public int getsize() {
        return size;
    }
    public Manager findUsingEnhancedForLoop(String name, List<Manager> stuff) {
        for (Manager manager : stuff) {
            if (manager.getName().equals("denis")) {
                return manager;
            }
            return null;
        }
        return null;
    }
}

