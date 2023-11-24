package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome, let's test!\n");
        ZooManager zoo = new ZooManager();
        zoo.addAnimal(new Eagle("Aquila1", "abc", 3, LocalDate.now(), 125, 100, 100));

        zoo.addAnimal(new Eagle("Aquila1", "abc", 3, LocalDate.now(), 25, 100, 100));
        zoo.addAnimal(new Eagle("Aquila2", "cvb", 5, LocalDate.now(), 30, 110, 150));
        zoo.addAnimal(new Lion("Leone1", "abc", 3, LocalDate.now(), 150, 124, 70));
        zoo.addAnimal(new Lion("Leone2", "cvb", 5, LocalDate.now(), 160, 136, 59));
        zoo.addAnimal(new Tiger("Tigre1", "abc", 3, LocalDate.now(), 120, 111, 32));
        zoo.addAnimal(new Tiger("Tigre2", "cvb", 5, LocalDate.now(), 140, 124, 43));
        System.out.println("Highest Lion: " + zoo.getHighestSpecimen(Lion.class).getName());
        System.out.println("Lowest Lion: " + zoo.getLowestSpecimen(Lion.class).getName());
        System.out.println("Highest Tiger: " + zoo.getHighestSpecimen(Tiger.class).getName());
        System.out.println("Lowest Tiger: " + zoo.getLowestSpecimen(Tiger.class).getName());
        System.out.println("Highest Eagle: " + zoo.getHighestSpecimen(Eagle.class).getName());
        System.out.println("Lowest Eagle: " + zoo.getLowestSpecimen(Eagle.class).getName());
        System.out.println("Heavier Lion: " + zoo.getHeaviestSpecimen(Lion.class).getName());
        System.out.println("Lighter Lion: " + zoo.getLightestSpecimen(Lion.class).getName());
        System.out.println("Heavier Tiger: " + zoo.getHeaviestSpecimen(Tiger.class).getName());
        System.out.println("Lighter Tiger: " + zoo.getLightestSpecimen(Tiger.class).getName());
        System.out.println("Heavier Eagle: " + zoo.getHeaviestSpecimen(Eagle.class).getName());
        System.out.println("Lighter Eagle: " + zoo.getLightestSpecimen(Eagle.class).getName());
        System.out.println("Longest Tailed Animal: " + zoo.getLongestTailedAnimal().getName());
        System.out.println("Largest Wingspan Animal: " + zoo.getLargestWingspanAnimal().getName());
        System.out.println("\nTest finished!");
    }
}