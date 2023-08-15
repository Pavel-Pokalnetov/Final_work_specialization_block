package AppTools.Menu;

import AppTools.AnimalsBookTools;
import AppTools.MainAnimalsBook;

public class ViewAnimalsTable implements Runnable {
    MainAnimalsBook animalsBook = null;
    public ViewAnimalsTable(MainAnimalsBook animalsBook) {
        this.animalsBook = animalsBook;
    }
    @Override
    public void run() {
        System.out.println("Таблица данных по животным");
        AnimalsBookTools.print_animals_to_table(animalsBook);
    }
}
