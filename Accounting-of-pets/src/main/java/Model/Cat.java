package Model;

class Cat extends HomeAnimals {
    @Override
    public void speak() {
    meows();
    }

    @Override
    public void eat() {
        System.out.println("Кошка " + name + " поела");
    }

    @Override
    public void run_command() {
        System.out.println("Кошка " + name + " выполнила команду");

    }

    void meows() {
        System.out.println("Кошка " + name + " мяукает");
    }


}
