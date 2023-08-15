package Main;

import BaseClasses.Animal;
import BaseClasses.AnimalBook.AnimalsBookTools;
import BaseClasses.AnimalBook.MainAnimalsBook;
import BaseClasses.HomeAnimals.Cat;
import BaseClasses.PackAnimals.Horse;

public class App {
    public static void main(String[] args) {
//        MainAnimalsBook animals_storage = new MainAnimalsBook("Загон 1");
//        animals_storage.add(new Horse("Рысь","2018/06/01", 120,"Рысью,Шагом,Стой,Лежать"));
//        animals_storage.add(new Horse("Статный","2020/01/15", 70,"Рысью,Шагом,Стой,Лежать"));
//        animals_storage.add(new Horse("Мурка","2022/01/01", 30));
//
//        AnimalsBookTools.print_animals_to_table(animals_storage);
//
//        while (true) {
//            String s = CInput.read("Введи строку: ");
//            System.out.println("Ответ: "+s);
//            if (s.equals("Q")) break;
//        }
//    }

        CMenu menu1 = new CMenu("Главное меню");
        menu1.add('1',"первый");
        menu1.add('2',"второй");
        menu1.add('3',"третий");

        System.out.println(menu1.run());
}}
