package zoo.zooManagement;

import zoo.animals.*;
import zoo.behaviors.*;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void interactWithAnimal(Animal animal) {
        System.out.println(name + " is interacting with " + animal.getName());
        animal.makeSound();
    }

    public void feedAnimal(Feedable feedable) {
        feedable.feed("fish");
    }

    public void playWithAnimal(Playable playable) {
        playable.play();
    }
}
