<<<<<<<< HEAD:src/main/java/org/example/animals/Lion.java
package org.example.animals;
========
package exercise.zoo.model;
>>>>>>>> functional_methods:src/main/java/exercise/zoo/model/Lion.java

import java.time.LocalDate;

public class Lion extends TailedAnimal {
    public Lion(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double tailLength) {
        super(name, favouriteMeal, age, arrivalDate, weight, height, tailLength);
    }
}
