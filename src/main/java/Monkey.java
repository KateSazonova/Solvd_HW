package main.java;

import java.util.ArrayList;
import java.util.List;

public class Monkey extends Animal {
    public Monkey(String kaind, String eat) {
        super(kaind, eat);
    }

    public void makeSound() {
        System.out.println("Say u-u-u-u");
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
        Monkey gorilla1 = new Monkey("gorilla", "banana");
        gorilla1.makeSound();
        gorilla1.bite();
        System.out.println(gorilla1.toString());
        Monkey gorilla2 = new Monkey("gorilla", "appel");
        System.out.println(gorilla1.equals(gorilla2));
        Animal gorilla3 = new Monkey("gorilla", "peach");
        gorilla3.showInfo();

        List<Monkey> list=new ArrayList<>();
        list.add(gorilla1);
        list.add(gorilla2);
        list.add((Monkey) gorilla3);
        System.out.println("LinkedList=" + list);

    }

}