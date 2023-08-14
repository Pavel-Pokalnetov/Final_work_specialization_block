package Main;

import BaseClasses.Animal;
import BaseClasses.AnimalBook.AnimalsBookTools;
import BaseClasses.AnimalBook.MainAnimalsBook;
import BaseClasses.HomeAnimals.Cat;
import BaseClasses.PackAnimals.Horse;

public class App {
    public static void main(String[] args) {
        MainAnimalsBook test_book = new MainAnimalsBook("Загон 1");
        test_book.add(new Horse("Рысь","2018/06/01", 120,"Рысью,Шагом,Стой,Лежать"));
        test_book.add(new Horse("Статный","2020/01/15", 70,"Рысью,Шагом,Стой,Лежать"));
        test_book.add(new Horse("Мурка","2022/01/01", 30));

        AnimalsBookTools.print_animals_to_table(test_book);
    }
}
