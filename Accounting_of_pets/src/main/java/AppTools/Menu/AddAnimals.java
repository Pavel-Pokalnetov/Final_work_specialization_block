package AppTools.Menu;

import AppTools.AnimalsBookTools;
import AppTools.MainAnimalsBook;

public class AddAnimals implements Runnable {
    MainAnimalsBook animalsBook = null;
    public AddAnimals(MainAnimalsBook animalsBook) {
        this.animalsBook = animalsBook;
    }

    @Override
    public void run() {
        System.out.println("Добавление животного");
        AnimalsBookTools.addAnimalsDialog(animalsBook);
    }
}
