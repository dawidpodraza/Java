package animal.cat;

import animal.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Miaaał");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }
}
