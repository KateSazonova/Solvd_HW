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
        Monkey gorilla1 = new Monkey("gorilla", "banana");
        gorilla1.makeSound();
        gorilla1.eat();
        gorilla1.bite();
        System.out.println(gorilla1.toString());
        Monkey gorilla2 = new Monkey("gorilla", "appel");
        System.out.println(gorilla1.equals(gorilla2));
    }
}
