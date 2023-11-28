package org.example.controller;

import org.example.animals.Animal;
import org.example.animals.TailedAnimal;
import org.example.animals.WingedAnimal;

import java.util.*;

public class ZooManager {

    private final Map<Class<? extends Animal>, List<Animal>> animalsMap;

    public ZooManager() {
        animalsMap = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            return;
        }
        animalsMap.putIfAbsent(animal.getClass(), new ArrayList<>());
        animalsMap.get(animal.getClass()).add(animal);
    }

    public <T extends Animal> T getHighestSpecimen(Class<T> animalSpecificClass) {
        return getSpeciesList(animalSpecificClass)
                .stream()
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);
    }

    public <T extends Animal> T getLowestSpecimen(Class<T> animalSpecificClass) {
        return getSpeciesList(animalSpecificClass)
                .stream()
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);
    }

    public <T extends Animal> T getHeaviestSpecimen(Class<T> animalSpecificClass) {
        return getSpeciesList(animalSpecificClass)
                .stream()
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }

    public <T extends Animal> T getLightestSpecimen(Class<T> animalSpecificClass) {
        return getSpeciesList(animalSpecificClass)
                .stream()
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }

    public TailedAnimal getLongestTailedAnimal() {
        return getSpeciesList(TailedAnimal.class)
                .stream()
                .max(Comparator.comparing(TailedAnimal::getTailLength))
                .orElse(null);
    }

    public WingedAnimal getLargestWingspanAnimal() {
        return getSpeciesList(WingedAnimal.class)
                .stream()
                .max(Comparator.comparing(WingedAnimal::getWingspan))
                .orElse(null);
    }

    private <T extends Animal> List<T> getSpeciesList(Class<T> animalSpecificClass) {
        return animalsMap
                .entrySet()
                .stream()
                .filter(e -> animalSpecificClass.isAssignableFrom(e.getKey()))
                .flatMap(e -> e.getValue().stream())
                .map(animalSpecificClass::cast)
                .toList();
    }
}