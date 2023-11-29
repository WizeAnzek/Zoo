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
        zoo.addAnimal(new Eagle("Aquila1", "abc", 3, LocalDate.now(), 25, 100, 100));
        zoo.addAnimal(new Eagle("Aquila2", "cvb", 5, LocalDate.now(), 30, 110, 150));
        zoo.addAnimal(new Lion("Leone1", "abc", 3, LocalDate.now(), 150, 124, 70));
        zoo.addAnimal(new Lion("Leone2", "cvb", 5, LocalDate.now(), 160, 136, 59));
        zoo.addAnimal(new Tiger("Tigre1", "abc", 3, LocalDate.now(), 120, 111, 32));
        zoo.addAnimal(new Tiger("Tigre2", "cvb", 5, LocalDate.now(), 140, 124, 43));
        logger.debug("Highest Lion: {}", zoo.getHighestSpecimen(Lion.class).getName());
        logger.debug("Lowest Lion: {}", zoo.getLowestSpecimen(Lion.class).getName());
        Lion a = zoo.getHighestSpecimen(Lion.class);
        logger.debug("Highest Tiger: {}", a.getName());
        logger.debug("Lowest Tiger: {}", zoo.getLowestSpecimen(Tiger.class).getName());
        logger.debug("Highest Eagle: {}", zoo.getHighestSpecimen(Eagle.class).getName());
        logger.debug("Lowest Eagle: {}", zoo.getLowestSpecimen(Eagle.class).getName());
        logger.debug("Heavier Lion: {}", zoo.getHeaviestSpecimen(Lion.class).getName());
        logger.debug("Lighter Lion: {}", zoo.getLightestSpecimen(Lion.class).getName());
        logger.debug("Heavier Tiger: {}", zoo.getHeaviestSpecimen(Tiger.class).getName());
        logger.debug("Lighter Tiger: {}", zoo.getLightestSpecimen(Tiger.class).getName());
        logger.debug("Heavier Eagle: {}", zoo.getHeaviestSpecimen(Eagle.class).getName());
        logger.debug("Lighter Eagle: {}", zoo.getLightestSpecimen(Eagle.class).getName());
        logger.debug("Longest Tailed Animal: {}", zoo.getLongestTailedAnimal().getName());
        logger.debug("Largest Wingspan Animal: {}", zoo.getLargestWingspanAnimal().getName());
        logger.debug("Test finished!");
    }
}