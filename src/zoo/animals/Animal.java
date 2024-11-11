package zoo.animals;

public abstract class Animal {
    private String name;
    private int age;

    // Constructors
    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    // Overloaded method
    public void feed(String food) {
        System.out.println(name + " is being fed " + food);
    }

    public void feed(String food, int quantity) {
        System.out.println(name + " is being fed " + quantity + " units of " + food);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
