package zoo.animals;

public class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " the lion roars loudly!");
    }
}
