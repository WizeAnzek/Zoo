package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome, let's test!\n");
        GestionaleZoo zoo = new GestionaleZoo();
        zoo.addEagle(new Eagle("Aquila1", "abc", 3, LocalDate.now(), 25, 100, 100));
        zoo.addEagle(new Eagle("Aquila2", "cvb", 5, LocalDate.now(), 30, 110, 150));
        zoo.addLion(new Lion("Leone1", "abc", 3, LocalDate.now(), 150, 124, 70));
        zoo.addLion(new Lion("Leone2", "cvb", 5, LocalDate.now(), 160, 136, 59));
        zoo.addTiger(new Tiger("Tigre1", "abc", 3, LocalDate.now(), 120, 111, 32));
        zoo.addTiger(new Tiger("Tigre2", "cvb", 5, LocalDate.now(), 140, 124, 43));
        System.out.println("Highest Lion: " + zoo.getHighestLion().getName());
        System.out.println("Lowest Lion: " + zoo.getLowestLion().getName());
        System.out.println("Highest Tiger: " + zoo.getHighestTiger().getName());
        System.out.println("Lowest Tiger: " + zoo.getLowestTiger().getName());
        System.out.println("Highest Eagle: " + zoo.getHighestEagle().getName());
        System.out.println("Lowest Eagle: " + zoo.getLowestEagle().getName());
        System.out.println("Heavier Lion: " + zoo.getHeavierLion().getName());
        System.out.println("Lighter Lion: " + zoo.getLighterLion().getName());
        System.out.println("Heavier Tiger: " + zoo.getHeavierTiger().getName());
        System.out.println("Lighter Tiger: " + zoo.getLighterTiger().getName());
        System.out.println("Heavier Eagle: " + zoo.getHeavierEagle().getName());
        System.out.println("Lighter Eagle: " + zoo.getLighterEagle().getName());
        System.out.println("Longest Tailed Animal: " + zoo.getLongestTailedAnimal().getName());
        System.out.println("Largest Wingspan Animal: " + zoo.getLargestWingspanAnimal().getName());
        System.out.println("\nTest finished!");
    }
}