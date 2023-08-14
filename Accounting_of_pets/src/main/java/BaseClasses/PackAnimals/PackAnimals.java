package BaseClasses.PackAnimals;

import BaseClasses.Animal;

public class PackAnimals extends Animal {
    int tonnage;

    public PackAnimals(String name, String birthday, String type) {
        super(name, birthday, type);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Грузоподъемность: "+tonnage;
    }
}
