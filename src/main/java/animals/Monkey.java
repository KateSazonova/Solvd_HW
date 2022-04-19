package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Monkey extends Animal {
    private static final Logger LOGGER = LogManager.getLogger(Monkey.class);

    public Monkey(String kaind, String eat) {
        super(kaind, eat);
    }

    public void makeSound() {
        LOGGER.info("Say u-u-u-u");
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
