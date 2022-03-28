package main.java;

public class Main {
    public static void main(String[] args) {
        Cat lion1 = new Cat("lion", "meat");
        lion1.makeSound();
        lion1.bite();
        System.out.println(lion1.toString());
        Cat lion2 = new Cat("lion", "meat");
        System.out.println(lion1.equals(lion2));
        lion1.showInfo();
        lion1.drink();
        Cat lion3 = new Cat("lion", "meat");
        try {
            lion3.setKaind("wight");
        } catch (KaindException e) {
            e.printStackTrace();
        }
    }
}
