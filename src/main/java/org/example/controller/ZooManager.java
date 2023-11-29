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

    /**
     * devo usare getSpeciesList e non una semplice get per avere la lista poiché
     * anche le classi astratte come WingedAnimal, subtype of Animal, potrebbe invocare questo metodo poiché estendono Animal.
     * Se facessi get(WingedAnimal) avrei lista vuota perché la map mappa alle sottoclassi non astratte
     */
    public <T extends Animal> T getHighestSpecimen(Class<T> animalSpecificClass) {
        List<T> speciesList = getSpeciesList(animalSpecificClass);
        if (speciesList.isEmpty()) {
            return null;
        }
        T currentHighestSpecimen = speciesList.getFirst();
        for (T specimen : speciesList) {
            if (specimen.getHeight() > currentHighestSpecimen.getHeight()) {
                currentHighestSpecimen = specimen;
            }
        }
        return currentHighestSpecimen;
    }

    public <T extends Animal> T getLowestSpecimen(Class<T> animalSpecificClass) {
        List<T> speciesList = getSpeciesList(animalSpecificClass);
        if (speciesList.isEmpty()) {
            return null;
        }
        T currentLowestSpecimen = speciesList.getFirst();
        for (T specimen : speciesList) {
            if (specimen.getHeight() < currentLowestSpecimen.getHeight()) {
                currentLowestSpecimen = specimen;
            }
        }
        return currentLowestSpecimen;
    }

    public <T extends Animal> T getHeaviestSpecimen(Class<T> animalSpecificClass) {
        List<T> speciesList = getSpeciesList(animalSpecificClass);
        if (speciesList.isEmpty()) {
            return null;
        }
        T currentHeaviestSpecimen = speciesList.getFirst();
        for (T specimen : speciesList) {
            if (specimen.getWeight() > currentHeaviestSpecimen.getWeight()) {
                currentHeaviestSpecimen = specimen;
            }
        }
        return currentHeaviestSpecimen;
    }

    public <T extends Animal> T getLightestSpecimen(Class<T> animalSpecificClass) {
        List<T> speciesList = getSpeciesList(animalSpecificClass);
        if (speciesList.isEmpty()) {
            return null;
        }
        T currentLightestSpecimen = speciesList.getFirst();
        for (T specimen : speciesList) {
            if (specimen.getHeight() < currentLightestSpecimen.getHeight()) {
                currentLightestSpecimen = specimen;
            }
        }
        return currentLightestSpecimen;
    }

    public TailedAnimal getLongestTailedAnimal() {
        List<TailedAnimal> tailedAnimalList = getSpeciesList(TailedAnimal.class);
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
        List<WingedAnimal> wingedAnimalList = getSpeciesList(WingedAnimal.class);
        if (wingedAnimalList.isEmpty()) {
            return null;
        }
        WingedAnimal currentWidestWingspanAnimal = wingedAnimalList.getFirst();
        for (WingedAnimal specimen : wingedAnimalList) {
            if (specimen.getWingspan() > currentWidestWingspanAnimal.getWingspan()) {
                currentWidestWingspanAnimal = specimen;
            }
        }
        return currentWidestWingspanAnimal;
    }

    private <T extends Animal> List<T> getSpeciesList(Class<T> animalSpecificClass) {
        List<Animal> speciesList = new ArrayList<>();
        for (Map.Entry<Class<? extends Animal>, List<Animal>> entry : animalsMap.entrySet()) {
            if (animalSpecificClass.isAssignableFrom(entry.getKey())) {
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

