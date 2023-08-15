package Main;

import AppTools.MainAnimalsBook;
import AppTools.Menu.CMenu;
import AppTools.Menu.DelAnimals;
import AppTools.Menu.ViewAnimalsTable;
import AppTools.Menu.AddAnimals;

public class App {
    public static void main(String[] args) {
        MainAnimalsBook animal_book = new MainAnimalsBook("Главная ");
        CMenu menu1 = new CMenu("Главное меню");
        menu1.addItem('1',"Вывести список животных",new ViewAnimalsTable(animal_book));
        menu1.addItem('2',"Добавить животное в список",new AddAnimals(animal_book));
        menu1.addItem('3',"Удалить животное из списка", new DelAnimals(animal_book));
        menu1.setQuit('0',"Выход");
        menu1.runMenu();
}

}
