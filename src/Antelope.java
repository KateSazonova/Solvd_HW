package src;

public class Antelope extends Animal{
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
        Antelope gazelle2 = new Antelope("gazelle", "grass");
        System.out.println(gazelle1.equals(gazelle2));
        gazelle2.eat();
    }

}
