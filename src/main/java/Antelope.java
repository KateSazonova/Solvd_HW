package main.java;

import java.util.LinkedList;
import java.util.List;

public class Antelope extends Animal {
    public Antelope(String kaind, String eat) {
        super(kaind, eat);
    }
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
        Antelope gazelle3 = new Antelope("gazelle", "grass");
        try {
            gazelle3.setKaind("gnu");
        } catch (KaindException e) {
            e.printStackTrace();
        }

        List<String>antelope=new LinkedList();
        antelope.add("gazelle");
        antelope.add("gnu");
        antelope.add("impala");
        System.out.println("LinkedList=" + antelope);

    }


}
