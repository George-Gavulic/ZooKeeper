package zoo.animals;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the parrot says: Hello!");
    }
}
