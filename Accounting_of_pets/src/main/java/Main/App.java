package Main;

import BaseClasses.Animal;
import BaseClasses.HomeAnimals.Cat;
import BaseClasses.PackAnimals.Horse;

public class App {
    public static void main(String[] args) {
        Animal test = new Horse("Рысь","2018/06/01", 120);
        System.out.println(test.toString());
    }
}
