package animal.dog;

import animal.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Hau Hau");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Plus dog eating");
    }
}
