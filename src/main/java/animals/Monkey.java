package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Monkey extends Animal {
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
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public static void main(String[] args) {
        Monkey gorilla1 = new Monkey("gorilla", "banana");
        gorilla1.makeSound();
        gorilla1.bite();
        LOGGER.info(gorilla1.toString());
        Monkey gorilla2 = new Monkey("gorilla", "appel");
        LOGGER.info(gorilla1.equals(gorilla2));
        Animal gorilla3 = new Monkey("gorilla", "peach");
        gorilla3.showInfo();

        List<Monkey> list=new ArrayList<>();
        list.add(gorilla1);
        list.add(gorilla2);
        list.add((Monkey) gorilla3);
        LOGGER.info("LinkedList=" + list);

    }

}
