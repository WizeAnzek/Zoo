<<<<<<<< HEAD:src/main/java/org/example/animals/Tiger.java
package org.example.animals;
========
package exercise.zoo.model;
>>>>>>>> functional_methods:src/main/java/exercise/zoo/model/Tiger.java

import java.time.LocalDate;

public class Tiger extends TailedAnimal {
    public Tiger(String name, String favouriteMeal, int age, LocalDate arrivalDate, double weight, int height, double tailLength) {
        super(name, favouriteMeal, age, arrivalDate, weight, height, tailLength);
    }
}
