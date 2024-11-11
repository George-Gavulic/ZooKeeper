package zoo.animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet!");
    }

    public void feed(String food) {
        System.out.println(getName() + " the bird is fed with " + food);
    }
}
