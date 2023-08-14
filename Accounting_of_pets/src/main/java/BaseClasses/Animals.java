package BaseClasses;

import java.util.ArrayList;

public class Animals {
    String name;
    String birthday;

    ArrayList<String> commandList = null;

    public Animals() {

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Имя: " + name + "\n");
        result.append("Дата рождения: " + birthday + "\n");
        result.append("Выполняемые команды:\n");
        if ((commandList != null) && (commandList.size() > 0)) {
            for (String item : commandList) {
                result.append(" - "+item+"\n");
            }
        }else {
            result.append("<командам не обучен>");
        }
        return result.toString();
    }


}
