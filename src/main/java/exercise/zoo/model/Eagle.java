<<<<<<<< HEAD:src/main/java/org/example/animals/Eagle.java
package org.example.animals;
========
package exercise.zoo.model;
>>>>>>>> functional_methods:src/main/java/exercise/zoo/model/Eagle.java

import java.time.LocalDate;

public class Eagle extends WingedAnimal {

    public Eagle(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double wingspan) {
        super(name, favouriteMeal, age, arrivalDate, weight, height, wingspan);
    }
}
