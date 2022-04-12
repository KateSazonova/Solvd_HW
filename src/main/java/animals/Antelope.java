package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;


public class Antelope extends Animal {
    public Antelope(String kaind, String eat) {
        super(kaind, eat);
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

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


    public static void main(String[] args) {

        Antelope gazelle1 = new Antelope("gazelle", "grass");
        gazelle1.makeSound();
        gazelle1.bite();
        LOGGER.info(gazelle1.toString());
        Antelope gazelle2 = new Antelope("gnu", "grass");
        LOGGER.info(gazelle1.equals(gazelle2));
        gazelle2.eat();
        Antelope gazelle3 = new Antelope("impala", "grass");
        try {
            gazelle3.setKaind("");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        List<String> antelope = new LinkedList<>();
        antelope.add(String.valueOf(gazelle1));
        antelope.add(String.valueOf(gazelle2));
        antelope.add(String.valueOf(gazelle3));
        LOGGER.info("LinkedList=" + antelope);

    }


}
