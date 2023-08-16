package BaseClasses.PackAnimals;

import BaseClasses.Animal;

public class PackAnimals extends Animal {
    private int tonnage;

    public PackAnimals(String name, String birthday, String type) {
        super(name, birthday, type);
    }

    public PackAnimals(String name, String birthday, String type, String command) {
        super(name, birthday, type);
        setCommandList(command);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Грузоподъемность: " + this.getTonnage();
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }
}
