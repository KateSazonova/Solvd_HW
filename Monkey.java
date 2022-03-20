public class Monkey extends Animal {
    public Monkey(String kaind, String eat) {
        super(kaind, eat);
    }
    public void eat() {
        System.out.println("I am eating "+getEat());
    }
    public void makeSound() {
        System.out.println("Say u-u-u-u");
    }
    @Override
    public void bite() {
        System.out.println("I am bite");
    }
    public static void main(String[] args) {
        Monkey gorilla = new Monkey("gorilla", "banana");
        gorilla.makeSound();
        gorilla.eat();
        gorilla.bite();
    }
}
