package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {

    private List<Eagle> eagleList;
    private List<Lion> lionList;
    private List<Tiger> tigerList;

    public ZooManager() {
        eagleList = new ArrayList<>();
        lionList = new ArrayList<>();
        tigerList = new ArrayList<>();
    }

    public boolean addLion(Lion lion) {
        return lionList.add(lion);
    }

    public boolean addTiger(Tiger tiger) {
        return tigerList.add(tiger);
    }

    public boolean addEagle(Eagle eagle) {
        return eagleList.add(eagle);
    }

    public Lion getHighestLion() {
        if (lionList.isEmpty())
            return null;
        Lion highest = lionList.get(0);
        if (lionList.size() == 1)
            return highest;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getHeight() > highest.getHeight())
                highest = lionList.get(i);
        }
        return highest;
    }

    public Lion getLowestLion() {
        if (lionList.isEmpty())
            return null;
        Lion lowest = lionList.get(0);
        if (lionList.size() == 1)
            return lowest;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getHeight() < lowest.getHeight())
                lowest = lionList.get(i);
        }
        return lowest;
    }

    public Tiger getHighestTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger highest = tigerList.get(0);
        if (tigerList.size() == 1)
            return highest;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getHeight() > highest.getHeight())
                highest = tigerList.get(i);
        }
        return highest;
    }

    public Tiger getLowestTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger lowest = tigerList.get(0);
        if (tigerList.size() == 1)
            return lowest;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getHeight() < lowest.getHeight())
                lowest = tigerList.get(i);
        }
        return lowest;
    }

    public Eagle getHighestEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle highest = eagleList.get(0);
        if (eagleList.size() == 1)
            return highest;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getHeight() > highest.getHeight())
                highest = eagleList.get(i);
        }
        return highest;
    }

    public Eagle getLowestEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle lowest = eagleList.get(0);
        if (eagleList.size() == 1)
            return lowest;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getHeight() < lowest.getHeight())
                lowest = eagleList.get(i);
        }
        return lowest;
    }

    public Lion getHeavierLion() {
        if (lionList.isEmpty())
            return null;
        Lion heavier = lionList.get(0);
        if (lionList.size() == 1)
            return heavier;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getWeight() > heavier.getWeight())
                heavier = lionList.get(i);
        }
        return heavier;
    }

    public Lion getLighterLion() {
        if (lionList.isEmpty())
            return null;
        Lion lighter = lionList.get(0);
        if (lionList.size() == 1)
            return lighter;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getWeight() < lighter.getWeight())
                lighter = lionList.get(i);
        }
        return lighter;
    }

    public Tiger getHeavierTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger heavier = tigerList.get(0);
        if (tigerList.size() == 1)
            return heavier;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getWeight() > heavier.getWeight())
                heavier = tigerList.get(i);
        }
        return heavier;
    }

    public Tiger getLighterTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger lighter = tigerList.get(0);
        if (tigerList.size() == 1)
            return lighter;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getWeight() < lighter.getWeight())
                lighter = tigerList.get(i);
        }
        return lighter;
    }

    public Eagle getHeavierEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle heavier = eagleList.get(0);
        if (eagleList.size() == 1)
            return heavier;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getWeight() > heavier.getWeight())
                heavier = eagleList.get(i);
        }
        return heavier;
    }

    public Eagle getLighterEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle lighter = eagleList.get(0);
        if (eagleList.size() == 1)
            return lighter;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getWeight() < lighter.getWeight())
                lighter = eagleList.get(i);
        }
        return lighter;
    }

    public TailedAnimal getLongestTailedAnimal() {
        List<TailedAnimal> tailedAnimalList = new ArrayList<>();
        tailedAnimalList.addAll(lionList);
        tailedAnimalList.addAll(tigerList);
        if (tailedAnimalList.isEmpty())
            return null;
        TailedAnimal longestTailedAnimal = tailedAnimalList.get(0);
        if (tailedAnimalList.size() == 1)
            return longestTailedAnimal;
        for (int i = 1; i < tailedAnimalList.size(); i++) {
            if (tailedAnimalList.get(i).getTailLength() < longestTailedAnimal.getTailLength())
                longestTailedAnimal = tailedAnimalList.get(i);
        }
        return longestTailedAnimal;
    }

    public WingedAnimal getLargestWingspanAnimal() {
        List<WingedAnimal> wingedAnimalList = new ArrayList<>(eagleList);
        if (wingedAnimalList.isEmpty())
            return null;
        WingedAnimal largestWingspanAnimal = wingedAnimalList.get(0);
        if (wingedAnimalList.size() == 1)
            return largestWingspanAnimal;
        for (int i = 1; i < wingedAnimalList.size(); i++) {
            if (wingedAnimalList.get(i).getWingspan() < largestWingspanAnimal.getWingspan())
                largestWingspanAnimal = wingedAnimalList.get(i);
        }
        return largestWingspanAnimal;
    }
}
