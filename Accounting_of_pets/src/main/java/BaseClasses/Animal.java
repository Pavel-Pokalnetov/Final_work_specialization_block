package BaseClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Animal {
    private String name;
    private String type;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Animal) {
            return ((Animal) obj).getId().equals(this.getId());
        }
        return false;
    }

    private String birthday;
    private ArrayList<String> commandList = null;
    private UUID id;

    public Animal(String name, String birthday, String type) {
        setName(name);
        setBirthday(birthday);
        setType(type);
        this.id = UUID.randomUUID();
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
        result.append("Выполняемые команды: ");
        if ((commandList != null) && (!commandList.isEmpty())) {
            result.append("\n");
            for (String item : commandList) {
                result.append(" - ").append(item).append("\n");
            }
        } else {
            result.append("<командам не обучен>");
        }
        return result.toString();
    }

    public String getJSON() {

        return null;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<String> getCommandList() {
        return commandList;
    }

    public UUID getId() {
        return id;
    }

    public String getCommandTXT() {
        if (this.commandList == null || this.commandList.isEmpty()) {
            return "командам не обучен";
        }
        return String.join(",", this.getCommandList());
    }

    public void setCommandList(String commands) {
        this.commandList.addAll(List.of(commands.split(",")));
    }
}
