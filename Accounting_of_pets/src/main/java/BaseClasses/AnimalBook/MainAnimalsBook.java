package BaseClasses.AnimalBook;

import BaseClasses.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class MainAnimalsBook {

    /**
     * Описание списка
     */
    String description = null;

    /**
     * Список для хранения животных
     */
    ArrayList<Animal> mainlist = null;

    public MainAnimalsBook(String description) {
        this.mainlist = new ArrayList<>();
        setDescription(description);
    }

    /** Добавляет животное в список
     * @param animal
     */
    public void add(Animal animal){
        this.mainlist.add(animal);
    }

    /** Удаляет животное из списка
     * @param animal
     * @return
     */
    public boolean del(Animal animal){
        if (this.mainlist.isEmpty())return false;
        Iterator<Animal> iterlist = mainlist.iterator();
        while(iterlist.hasNext()){
            Animal temp = iterlist.next();
            if (temp.equals(animal)){
                iterlist.remove();
                return true;
            }
        }
        return false;
    }


    public String getDescription() {
        return description;
    }

    public ArrayList<Animal> getMainlist() {
        return mainlist;
    }

    public int getSize(){
        return this.mainlist.size();
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
