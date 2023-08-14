package BaseClasses.PackAnimals;

import java.util.ArrayList;

public class Horse extends PackAnimals {
    public Horse(String name, String birthday, int tonnage, String commands) {
        super(name,birthday,"лошадь");
        setTonnage(tonnage);
        setCommandList(commands);
    }
}
