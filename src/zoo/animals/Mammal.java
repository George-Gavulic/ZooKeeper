package zoo.animals;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Roar!");
    }

    public void feed(String food) {
        System.out.println(getName() + " the mammal is fed with " + food);
    }
}
