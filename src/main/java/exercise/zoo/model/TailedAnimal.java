<<<<<<<< HEAD:src/main/java/org/example/animals/TailedAnimal.java
package org.example.animals;
========
package exercise.zoo.model;
>>>>>>>> functional_methods:src/main/java/exercise/zoo/model/TailedAnimal.java

import java.time.LocalDate;

public abstract class TailedAnimal extends Animal {

    private final double tailLength;

    protected TailedAnimal(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double tailLength) {
        super(name, favouriteMeal, age, arrivalDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}
