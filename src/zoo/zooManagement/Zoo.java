package zoo.zooManagement;

import zoo.animals.*;
import zoo.behaviors.*;

public class Zoo {
    private Animal[] animals;
    private int animalCount;

    public Zoo(int capacity) {
        animals = new Animal[capacity];
        animalCount = 0;
    }

    public void addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount++] = animal;
        } else {
            System.out.println("Zoo is at full capacity!");
        }
    }

    public void showAllAnimals() {
        for (int i = 0; i < animalCount; i++) {
            animals[i].makeSound();
        }
    }

    public void feedAllAnimals(String food) {
        for (int i = 0; i < animalCount; i++) {
            animals[i].feed(food);
        }
    }
}
