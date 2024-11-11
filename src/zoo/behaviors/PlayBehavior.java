package zoo.behaviors;

import zoo.animals.Animal;

public class PlayBehavior implements Playable {
    private Animal animal;

    public PlayBehavior(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void play() {
        System.out.println(animal.getName() + " is playing!");
    }

    @Override
    public void play(int hours) {
        System.out.println(animal.getName() + " is playing for " + hours + " hours!");
    }
}
