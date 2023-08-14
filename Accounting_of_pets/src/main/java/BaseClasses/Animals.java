package BaseClasses;

import java.util.ArrayList;

public class Animals {
    String name;
    String type;
    String birthday;
    ArrayList<String> commandList = null;

    public Animals() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Тип: ").append(type).append("\n");
        result.append("Имя: ").append(name).append("\n");
        result.append("Дата рождения: ").append(birthday).append("\n");
        result.append("Выполняемые команды:\n");
        if ((commandList != null) && (!commandList.isEmpty())) {
            for (String item : commandList) {
                result.append(" - ").append(item).append("\n");
            }
        } else {
            result.append("<командам не обучен>");
        }
        return result.toString();
    }

    public String getJSON() {
        
        return  null;
    }
}
