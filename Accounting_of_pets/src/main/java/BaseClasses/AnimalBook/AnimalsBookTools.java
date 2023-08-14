package BaseClasses.AnimalBook;

import BaseClasses.Animal;

import java.util.Iterator;


public class AnimalsBookTools {
    /** Удаляет животных по типу
     * @param m список животных
     * @param type тип
     * @return
     */
    public static int del_by_type(MainAnimalsBook m,String type){
        if ((m.getSize()==0) || (type==null)) return 0;
        int count = 0;
        Iterator<Animal> iterator = m.getMainlist().iterator();
        while(iterator.hasNext()){
            if (type.equals(iterator.next().getType())){
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    /** Вывод списка животных в виде таблицы
     * @param m
     */
    public static void print_animals_to_table(MainAnimalsBook m){

    }

}
