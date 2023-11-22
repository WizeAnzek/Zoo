package org.example;

import java.time.LocalDate;

public abstract class Animal {

    private String name;
    private String favouriteMeal;
    private int age;
    private LocalDate arrivalDate;
    private double weight;
    private int height;

    public Animal(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height) {
        this.name = name;
        this.favouriteMeal = favouriteMeal;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteMeal() {
        return favouriteMeal;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public double getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
