package org.example.animals;

import java.time.LocalDate;

public abstract class TailedAnimal extends Animal {

    private double tailLength;

    public TailedAnimal(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double tailLength) {
        super(name, favouriteMeal, age, arrivalDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}
