package org.example;

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
        Class<? extends Animal> classAnimal = animal.getClass();
        animalsMap.putIfAbsent(classAnimal, new ArrayList<>());
        animalsMap.get(classAnimal).add(animal);
    }

    public Animal getHighestSpecimen(Class<? extends Animal> type) {
        if (animalsMap.get(type) == null) {
            return null;
        }
        List<Animal> speciesList = animalsMap.get(type);
        Animal currentHighestSpecimen = speciesList.getFirst();
        for (Animal specimen : speciesList) {
            if (specimen.getHeight() > currentHighestSpecimen.getHeight()) {
                currentHighestSpecimen = specimen;
            }
        }
        return currentHighestSpecimen;
    }

    public Animal getLowestSpecimen(Class<? extends Animal> type) {
        if (animalsMap.get(type) == null) {
            return null;
        }
        List<Animal> speciesList = animalsMap.get(type);
        Animal currentLowestSpecimen = speciesList.getFirst();
        for (Animal specimen : speciesList) {
            if (specimen.getHeight() < currentLowestSpecimen.getHeight()) {
                currentLowestSpecimen = specimen;
            }
        }
        return currentLowestSpecimen;
    }

    public Animal getHeaviestSpecimen(Class<? extends Animal> type) {
        if (animalsMap.get(type) == null) {
            return null;
        }
        List<Animal> speciesList = animalsMap.get(type);
        Animal currentHeaviestSpecimen = speciesList.getFirst();
        for (Animal specimen : speciesList) {
            if (specimen.getWeight() > currentHeaviestSpecimen.getWeight()) {
                currentHeaviestSpecimen = specimen;
            }
        }
        return currentHeaviestSpecimen;
    }

    public Animal getLightestSpecimen(Class<? extends Animal> type) {
        if (animalsMap.get(type) == null) {
            return null;
        }
        List<Animal> speciesList = animalsMap.get(type);
        Animal currentLightestSpecimen = speciesList.getFirst();
        for (Animal specimen : speciesList) {
            if (specimen.getHeight() < currentLightestSpecimen.getHeight()) {
                currentLightestSpecimen = specimen;
            }
        }
        return currentLightestSpecimen;
    }

    public TailedAnimal getLongestTailedAnimal() {
        List<TailedAnimal> tailedAnimalList = getSuperSpeciesList(TailedAnimal.class);
        if (tailedAnimalList.isEmpty()) {
            return null;
        }
        TailedAnimal currentLongestTailedAnimal = tailedAnimalList.getFirst();
        for (TailedAnimal specimen : tailedAnimalList) {
            if (specimen.getTailLength() > currentLongestTailedAnimal.getTailLength()) {
                currentLongestTailedAnimal = specimen;
            }
        }
        return currentLongestTailedAnimal;
    }

    public WingedAnimal getLargestWingspanAnimal() {
        List<WingedAnimal> wingedAnimalList = getSuperSpeciesList(WingedAnimal.class);
        if (wingedAnimalList.isEmpty())
            return null;
        WingedAnimal currentWidestWingspanAnimal = wingedAnimalList.getFirst();
        for (WingedAnimal specimen : wingedAnimalList) {
            if (specimen.getWingspan() > currentWidestWingspanAnimal.getWingspan()) {
                currentWidestWingspanAnimal = specimen;
            }
        }
        return currentWidestWingspanAnimal;
    }

    private <T extends Animal> List<T> getSuperSpeciesList(Class<? extends Animal> type) {
        List<Animal> speciesList = new ArrayList<>();
        for (Map.Entry<Class<? extends Animal>, List<Animal>> entry : animalsMap.entrySet()) {
            if (type.isAssignableFrom(entry.getKey())) {
                speciesList.addAll(entry.getValue());
            }
        }
        List<T> castedSpeciesList = new ArrayList<>();
        for (Animal animal : speciesList) {
            T castedAnimal = (T) animal;
            castedSpeciesList.add(castedAnimal);
        }
        return castedSpeciesList;
    }
}

