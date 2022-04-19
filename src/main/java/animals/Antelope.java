package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;


public class Antelope extends Animal {
    private static final Logger LOGGER = LogManager.getLogger(Antelope.class);

    public Antelope(String kaind, String eat) {
        super(kaind, eat);
    }

    public void makeSound() {
        LOGGER.info("Say igogo");
    }

    @Override
    public void bite() {
        LOGGER.info("I am bite");
    }

    @Override
    public void showInfo() {
        LOGGER.info(getKaind());
    }


    @Override
    public void fight() {
        LOGGER.info("I can not fight");
    }

    @Override
    public void attack() {
        LOGGER.info("I can not attack");
    }


}
