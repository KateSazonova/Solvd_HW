package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class Cat extends Animal {
    private static final Logger LOGGER = LogManager.getLogger(Cat.class);

    public Cat(String kaind, String eat) {
        super(kaind, eat);
    }

    public void makeSound() {
        LOGGER.info("Say rrr");
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
        LOGGER.info("I can fight");
    }

    @Override
    public void attack() {
        LOGGER.info("I can attack");
    }


}
