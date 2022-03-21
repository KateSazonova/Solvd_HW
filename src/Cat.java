package src;

public class Cat extends Animal {
    public Cat(String kaind, String eat) {
        super(kaind, eat);
    }
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
        Cat lion1 = new Cat("lion", "meat");
        lion1.makeSound();
        lion1.bite();
        System.out.println(lion1.toString());
        Cat lion2 = new Cat ("lion", "meat");
        System.out.println(lion1.equals(lion2));
        lion1.showInfo();
        lion1.drink();
    }


}