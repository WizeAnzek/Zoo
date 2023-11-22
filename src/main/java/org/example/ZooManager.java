package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZooManager {

    private final List<Eagle> eagleList;
    private final List<Lion> lionList;
    private final List<Tiger> tigerList;

    public ZooManager() {
        eagleList = new ArrayList<>();
        lionList = new ArrayList<>();
        tigerList = new ArrayList<>();
    }

    public void addLion(Lion lion) {
        lionList.add(lion);
    }

    public void addTiger(Tiger tiger) {
        tigerList.add(tiger);
    }

    public void addEagle(Eagle eagle) {
        eagleList.add(eagle);
    }

    public Lion getHighestLion() {
        if (lionList.isEmpty())
            return null;
        Lion currentHighestLion = lionList.get(0);
        if (lionList.size() == 1)
            return currentHighestLion;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getHeight() > currentHighestLion.getHeight())
                currentHighestLion = lionList.get(i);
        }
        return currentHighestLion;
    }

    public Lion getLowestLion() {
        if (lionList.isEmpty())
            return null;
        Lion currentLowestLion = lionList.get(0);
        if (lionList.size() == 1)
            return currentLowestLion;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getHeight() < currentLowestLion.getHeight())
                currentLowestLion = lionList.get(i);
        }
        return currentLowestLion;
    }

    public Tiger getHighestTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger currentHighestTiger = tigerList.get(0);
        if (tigerList.size() == 1)
            return currentHighestTiger;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getHeight() > currentHighestTiger.getHeight())
                currentHighestTiger = tigerList.get(i);
        }
        return currentHighestTiger;
    }

    public Tiger getLowestTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger currentLowestTiger = tigerList.get(0);
        if (tigerList.size() == 1)
            return currentLowestTiger;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getHeight() < currentLowestTiger.getHeight())
                currentLowestTiger = tigerList.get(i);
        }
        return currentLowestTiger;
    }

    public Eagle getHighestEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle currentHighestEagle = eagleList.get(0);
        if (eagleList.size() == 1)
            return currentHighestEagle;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getHeight() > currentHighestEagle.getHeight())
                currentHighestEagle = eagleList.get(i);
        }
        return currentHighestEagle;
    }

    public Eagle getLowestEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle currentLowestEagle = eagleList.get(0);
        if (eagleList.size() == 1)
            return currentLowestEagle;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getHeight() < currentLowestEagle.getHeight())
                currentLowestEagle = eagleList.get(i);
        }
        return currentLowestEagle;
    }

    public Lion getHeavierLion() {
        if (lionList.isEmpty())
            return null;
        Lion currentHeavierLion = lionList.get(0);
        if (lionList.size() == 1)
            return currentHeavierLion;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getWeight() > currentHeavierLion.getWeight())
                currentHeavierLion = lionList.get(i);
        }
        return currentHeavierLion;
    }

    public Lion getLighterLion() {
        if (lionList.isEmpty())
            return null;
        Lion currentLighterLion = lionList.get(0);
        if (lionList.size() == 1)
            return currentLighterLion;
        for (int i = 1; i < lionList.size(); i++) {
            if (lionList.get(i).getWeight() < currentLighterLion.getWeight())
                currentLighterLion = lionList.get(i);
        }
        return currentLighterLion;
    }

    public Tiger getHeavierTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger currentHeavierTiger = tigerList.get(0);
        if (tigerList.size() == 1)
            return currentHeavierTiger;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getWeight() > currentHeavierTiger.getWeight())
                currentHeavierTiger = tigerList.get(i);
        }
        return currentHeavierTiger;
    }

    public Tiger getLighterTiger() {
        if (tigerList.isEmpty())
            return null;
        Tiger currentLighterTiger = tigerList.get(0);
        if (tigerList.size() == 1)
            return currentLighterTiger;
        for (int i = 1; i < tigerList.size(); i++) {
            if (tigerList.get(i).getWeight() < currentLighterTiger.getWeight())
                currentLighterTiger = tigerList.get(i);
        }
        return currentLighterTiger;
    }

    public Eagle getHeavierEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle currentHeavierEagle = eagleList.get(0);
        if (eagleList.size() == 1)
            return currentHeavierEagle;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getWeight() > currentHeavierEagle.getWeight())
                currentHeavierEagle = eagleList.get(i);
        }
        return currentHeavierEagle;
    }

    public Eagle getLighterEagle() {
        if (eagleList.isEmpty())
            return null;
        Eagle currentLighterEagle = eagleList.get(0);
        if (eagleList.size() == 1)
            return currentLighterEagle;
        for (int i = 1; i < eagleList.size(); i++) {
            if (eagleList.get(i).getWeight() < currentLighterEagle.getWeight())
                currentLighterEagle = eagleList.get(i);
        }
        return currentLighterEagle;
    }

    public TailedAnimal getLongestTailedAnimal() {
        List<TailedAnimal> tailedAnimalList = new ArrayList<>();
        tailedAnimalList.addAll(lionList);
        tailedAnimalList.addAll(tigerList);
        if (tailedAnimalList.isEmpty())
            return null;
        TailedAnimal currentLongestTailedAnimal = tailedAnimalList.get(0);
        if (tailedAnimalList.size() == 1)
            return currentLongestTailedAnimal;
        for (int i = 1; i < tailedAnimalList.size(); i++) {
            if (tailedAnimalList.get(i).getTailLength() < currentLongestTailedAnimal.getTailLength())
                currentLongestTailedAnimal = tailedAnimalList.get(i);
        }
        return currentLongestTailedAnimal;
    }

    public WingedAnimal getLargestWingspanAnimal() {
        List<WingedAnimal> wingedAnimalList = new ArrayList<>(eagleList);
        if (wingedAnimalList.isEmpty())
            return null;
        WingedAnimal currentLargestWingspanAnimal = wingedAnimalList.get(0);
        if (wingedAnimalList.size() == 1)
            return currentLargestWingspanAnimal;
        for (int i = 1; i < wingedAnimalList.size(); i++) {
            if (wingedAnimalList.get(i).getWingspan() < currentLargestWingspanAnimal.getWingspan())
                currentLargestWingspanAnimal = wingedAnimalList.get(i);
        }
        return currentLargestWingspanAnimal;
    }
}
