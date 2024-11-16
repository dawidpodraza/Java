import animal.Animal;
import animal.cat.Cat;
import animal.dog.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Kicia");
        Animal animal = new Animal("Zwierze");

        dog.eat();
        dog.voice();

        cat.eat();
        cat.voice();

        animal.voice();
        animal.eat();


        boolean isAnimal = cat instanceof Animal;
        System.out.println(isAnimal);
        boolean isCat = cat instanceof Cat;
        System.out.println(isCat);
    }
}
