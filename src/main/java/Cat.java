package main.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class Cat extends Animal {
    public Cat(String kaind, String eat) {
        super(kaind, eat);
    }

    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public void makeSound() {
        System.out.println("Say rrr");
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
        System.out.println("I can fight");
    }

    @Override
    public void attack() {
        System.out.println("I can attack");
    }



    public static void main(String[] args) {
        Cat lion1 = new Cat("african lion", "meat");
        lion1.makeSound();
        lion1.bite();
        System.out.println(lion1.toString());
        Cat lion2 = new Cat("white lion", "chicken");
        System.out.println(lion1.equals(lion2));
        lion1.showInfo();
        lion1.drink();
        Cat lion3 = new Cat("asian lion", "antelope");
        try {
            lion3.setKaind("");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        LinkedList<Cat> catLinkedList = new LinkedList<>();
        catLinkedList.add(lion1);
        catLinkedList.add(lion2);
        catLinkedList.add(lion3);
        System.out.println("LinkedList=" + catLinkedList);
        catLinkedList.remove(2);
        System.out.println("LinkedList=" + catLinkedList);
        collection(catLinkedList);

    }

}
