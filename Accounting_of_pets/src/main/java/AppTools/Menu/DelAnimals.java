package AppTools.Menu;

import AppTools.AnimalsBookTools;
import AppTools.CInput;
import AppTools.MainAnimalsBook;

public class DelAnimals implements Runnable {
    MainAnimalsBook animalsBook;

    public DelAnimals(MainAnimalsBook animalsBook) {
        this.animalsBook = animalsBook;
    }

    @Override
    public void run() {
        String answer;
        while (true) {
            System.out.println("Удаление животного");
            System.out.println("1 - по имени\n2* - по дате рождения\n3* - по типу\n4* - по id\n0 - назад\n * - в разработке");
            try {
                answer = CInput.read();
                if (answer.length() != 1) throw new RuntimeException();
                if (!"12340".contains(answer)) throw new RuntimeException();
                break;
            } catch (Exception e) {
                System.out.println("неправильный ввод");
            }
        }
        if ("0".equals(answer)) return;
        switch (answer) {
            case ("1") -> {
                //удаление по имени
                String name = CInput.read("Введите имя животного: ");
                if (name.isEmpty()) {
                    System.out.println("Отмена");
                    return;
                }
                int count = AnimalsBookTools.del_by_name(animalsBook, name);
                if (count > 0) System.out.println("Удалено " + count + " записей");
            }
            case ("2"), ("3"), ("4") -> {
                System.out.println("Функция в разработке");
            }
        }
    }
}
