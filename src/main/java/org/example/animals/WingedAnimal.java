package org.example.animals;

import java.time.LocalDate;

public abstract class WingedAnimal extends Animal {
    private double wingspan;

    public WingedAnimal(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double wingspan) {
        super(name, favouriteMeal, age, arrivalDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }
}
