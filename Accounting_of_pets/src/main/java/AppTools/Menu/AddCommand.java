package AppTools.Menu;

import AppTools.CInput;
import AppTools.MainAnimalsBook;
import BaseClasses.Animal;

@SuppressWarnings("ALL")
public class AddCommand implements Runnable {
    private MainAnimalsBook animalsBook;
    public AddCommand(MainAnimalsBook animalsBook) {
        this.animalsBook = animalsBook;
    }

    @Override
    public void run() {
        System.out.println("Обучение командам");
        System.out.println("Список животных");
        int count = 0;
        for (Animal a : animalsBook.getMainlist()) {
            System.out.printf("%-3d - %10s - %15s", ++count, a.getName(), a.getBirthday());
        }
        try {
            int animalNumber = Integer.parseInt(CInput.read("Укажите номер животного для добавления команды: "));
            if (animalNumber > count || animalNumber<1) {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Неправильный ввод");
        }
        Animal animal = animalsBook.getMainlist().get(count - 1);
        System.out.println("Выбрано животное\n"+animal.toString());
        String commands = CInput.read("Укажите добавляемые команды(через запятую)\n:");
        animal.setCommandList(commands);
        System.out.println("Добавлены команды для животного "+animal.getName());
        System.out.println(animal.toString());
    }
}

