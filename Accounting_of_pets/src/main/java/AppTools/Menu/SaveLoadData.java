package AppTools.Menu;

import AppTools.CInput;
import AppTools.MainAnimalsBook;
import IOStorage.Load;
import IOStorage.Save;

public class SaveLoadData implements Runnable{
    MainAnimalsBook animalsBook;
    public SaveLoadData(MainAnimalsBook animal_book) {
        this.animalsBook = animal_book;
    }

    @Override
    public void run() {
        String answer;
        while (true){
            try{
            System.out.println("1 - Загрузить данные\n2 - Сохранить данные\n3 - назад");
            answer = CInput.read(":");
            if (!"123".contains(answer))throw new RuntimeException();
            if("3".equals(answer))return;
            if (!("1".equals(answer)||"2".equals(answer)))throw new RuntimeException();
            break;
        }catch (RuntimeException e){
                System.out.println("Неправильный ввод");
            }
        }
        switch (answer){
            case ("1"):
                //Load
                new Load(animalsBook).run();
                break;
            case ("2"):
                new Save(animalsBook).run();
                break;
        }
    }
}
