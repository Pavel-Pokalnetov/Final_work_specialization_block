package Main;

import AppTools.MainAnimalsBook;
import AppTools.Menu.*;

public class App {
    public static void main(String[] args) {
        MainAnimalsBook animal_book = new MainAnimalsBook("Главная");
        CMenu main_menu = new CMenu("Главное меню");
            main_menu.addItem('1',"Вывести список животных",new ViewAnimalsTable(animal_book));
            main_menu.addItem('2',"Добавить животное в список",new AddAnimals(animal_book));
            main_menu.addItem('3',"Удалить животное из списка", new DelAnimals(animal_book));
            main_menu.addItem('4',"Обучить животное командам", new AddCommand(animal_book));
            //main_menu.addItem('5',"Сохранить/Загрузить", new SaveLoadData(animal_book));
        main_menu.setQuit('0',"Выход");
        main_menu.runMenu();
}

}
