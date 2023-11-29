package exercise.zoo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import exercise.zoo.controller.ZooManager;
import exercise.zoo.model.Eagle;
import exercise.zoo.model.Lion;
import exercise.zoo.model.Tiger;

import java.time.LocalDate;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.debug("Welcome, let's test!");
        ZooManager zoo = new ZooManager();
        zoo.addAnimal(new Eagle("Eagle1", "abc", 3, LocalDate.now(), 25, 100, 100));
        zoo.addAnimal(new Eagle("Eagle2", "cvb", 5, LocalDate.now(), 30, 110, 150));
        zoo.addAnimal(new Lion("Lion1", "abc", 3, LocalDate.now(), 150, 124, 70));
        zoo.addAnimal(new Lion("Lion2", "cvb", 5, LocalDate.now(), 160, 136, 59));
        zoo.addAnimal(new Tiger("Tiger1", "abc", 3, LocalDate.now(), 120, 111, 32));
        zoo.addAnimal(new Tiger("Tiger2", "cvb", 5, LocalDate.now(), 140, 124, 43));
        zoo.getHighestSpecimen(Lion.class).ifPresentOrElse(
                lion -> logger.debug("Highest Lion : {}", lion.getName()),
                () -> logger.debug("No lions in the zoo."));
        zoo.getLowestSpecimen(Lion.class).ifPresentOrElse(
                lion -> logger.debug("Lowest Lion : {}", lion.getName()),
                () -> logger.debug("No lions in the zoo."));
        zoo.getHeaviestSpecimen(Eagle.class).ifPresentOrElse(
                eagle -> logger.debug("Heaviest Eagle : {}", eagle.getName()),
                () -> logger.debug("No eagles in the zoo."));
        zoo.getLightestSpecimen(Tiger.class).ifPresentOrElse(
                tiger -> logger.debug("Heaviest Eagle : {}", tiger.getName()),
                () -> logger.debug("No eagles in the zoo."));
        zoo.getLongestTailedAnimal().ifPresentOrElse(
                tailedAnimal -> logger.debug("Longest Tailed Animal : {}", tailedAnimal.getName()),
                () -> logger.debug("No tailed animals in the zoo."));
        zoo.getLargestWingspanAnimal().ifPresentOrElse(
                wingedAnimal -> logger.debug("Largest Wingspan Animal : {}", wingedAnimal.getName()),
                () -> logger.debug("No winged animal in the zoo."));
        logger.debug("Test finished!");
    }
}