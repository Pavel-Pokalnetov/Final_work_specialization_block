package AppTools;

import BaseClasses.Animal;
import BaseClasses.HomeAnimals.Cat;
import BaseClasses.HomeAnimals.Dog;
import BaseClasses.HomeAnimals.Hamster;
import BaseClasses.PackAnimals.Camel;
import BaseClasses.PackAnimals.Donky;
import BaseClasses.PackAnimals.Horse;
import BaseClasses.PackAnimals.PackAnimals;

import java.util.Iterator;


public class AnimalsBookTools {
    /**
     * Удаляет животных по типу
     *
     * @param m    список животных
     * @param type тип
     * @return
     */
    public static int del_by_type(MainAnimalsBook m, String type) {
        if ((m.getSize() == 0) || (type == null)) return 0;
        int count = 0;
        Iterator<Animal> iterator = m.getMainlist().iterator();
        while (iterator.hasNext()) {
            if (type.equals(iterator.next().getType())) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    /**
     * Вывод списка животных в виде таблицы
     *
     * @param m
     */
    public static void print_animals_to_table(MainAnimalsBook m) {
        int width = 91;
        printLine(width);
        System.out.printf("| %14s | %10s | %10s | %-41s |\n", "Тип животного", "Имя", "Дата рождения", "Выполняемые команды");
        printLine(width);
        for (Animal a : m.getMainlist()) {
            System.out.printf("| %14s | %10s | %13s | %-41s |\n", a.getType(), a.getName(), a.getBirthday(), a.getCommandTXT());
        }
        printLine(width);
    }

    private static void printLine(int i) {
        System.out.print("|");
        while (i-- > 2) {
            System.out.print("-");
        }
        System.out.print("|\n");
    }

    public static void addAnimalsDialog(MainAnimalsBook animalsBook) {
        System.out.println("Ручное добавление животного (для отмены введите --- в любом диалоге)");
        System.out.println("Укажите тип животного ");
        String type = null;
        do {
            System.out.println("1 - собака\n2 - кошка\n3 - хомячок\n4 - лошадь\n5 - осёл\n6 - верблюд");
            type = CInput.read(":");
            if ("---".equals(type)) return;
            if (type.length() != 1) {
                System.out.println("неправильный ввод");
            }
            if ("123456".contains(type)) {
                break;
            }
            System.out.println("неправильный ввод");
        } while (true);
        String name = CInput.read("кличка: ");
        if ("---".equals(name)) return;
        String birthday = CInput.read("дата рождения(YYYY/MM/DD): ");
        if ("---".equals(birthday)) return;
        String commands = CInput.read("список команд через запятую(введите НЕТ, если командам не обучен): ");
        if ("---".equals(commands)) return;
        Animal animal = null;
        switch (type) {
            case ("1"):
                animal = new Dog(name, birthday);
                break;
            case ("2"):
                animal = new Cat(name, birthday);
                break;
            case ("3"):
                animal = new Hamster(name, birthday);
                break;
            case ("4"):
                animal = new Horse(name, birthday);
                break;
            case ("5"):
                animal = new Camel(name, birthday);
                break;
            case ("6"):
                animal = new Donky(name, birthday);
                break;
        }
        if ("456".contains(type)) {
            int tonnage;
            while (true) {
                try {
                    tonnage = Integer.parseInt(CInput.read("грузоподемность животного: "));
                    if (tonnage < 1) throw new NumberFormatException();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("неверный ввод");
                }
            }
            ((PackAnimals) animal).setTonnage(tonnage);
        }
        if ("нет".equals(commands.toLowerCase())) animal.setCommandList(commands);

        animalsBook.add(animal);
        System.out.println("Добавлено животное\n" + animal.toString());
    }
}
