package main.java;

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
        System.out.println("Say igogo");
    }

    @Override
    public void bite() {
        System.out.println("I am bite");
    }

    @Override
    public void showInfo() {
        System.out.println(getKaind());
    }


    @Override
    public void fight() {
        System.out.println("I can not fight");
    }

    @Override
    public void attack() {
        System.out.println("I can not attack");
    }


    public static void main(String[] args) {

        Antelope gazelle1 = new Antelope("gazelle", "grass");
        gazelle1.makeSound();
        gazelle1.bite();
        System.out.println(gazelle1.toString());
        Antelope gazelle2 = new Antelope("gnu", "grass");
        System.out.println(gazelle1.equals(gazelle2));
        gazelle2.eat();
        Antelope gazelle3 = new Antelope("impala", "grass");
        try {
            gazelle3.setKaind("gnu");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        List<String> antelope = new LinkedList<>();
        antelope.add(String.valueOf(gazelle1));
        antelope.add(String.valueOf(gazelle2));
        antelope.add(String.valueOf(gazelle3));
        System.out.println("LinkedList=" + antelope);

    }


}
