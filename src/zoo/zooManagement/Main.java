package zoo.zooManagement;

import zoo.animals.*;
import zoo.behaviors.*;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(5);
        Animal lion = new Lion("Simba");
        Animal parrot = new Parrot("Polly");

        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);

        zoo.showAllAnimals();
        zoo.feedAllAnimals("meat");

        Zookeeper zookeeper = new Zookeeper("John");
        zookeeper.interactWithAnimal(lion);
        zookeeper.playWithAnimal(new PlayBehavior(lion));
        zookeeper.feedAnimal(new FeedBehavior(parrot));
    }
}
