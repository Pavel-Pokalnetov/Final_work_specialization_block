package BaseClasses.AnimalBook;

import BaseClasses.Animal;

import java.util.ArrayList;
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
        int width = 83;
        printLine(width);
        System.out.printf("|%14s|%10s|%10s|%-41s|\n", "Тип животного", "Имя", "Дата рождения", "Выполняемые команды");
        printLine(width);
        for (Animal a : m.getMainlist()) {
            System.out.printf("|%14s|%10s|%13s|%-41s|\n", a.getType(),a.getName(),a.getBirthday(),a.getCommandTXT());
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

}
