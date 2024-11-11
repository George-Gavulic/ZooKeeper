package zoo.behaviors;

import zoo.animals.Animal;

public class FeedBehavior implements Feedable {
    private Animal animal;

    public FeedBehavior(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void feed() {
        System.out.println(animal.getName() + " is being fed!");
    }

    @Override
    public void feed(String food) {
        System.out.println(animal.getName() + " is being fed " + food);
    }
}
