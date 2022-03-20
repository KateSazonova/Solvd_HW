public class Cat extends Animal {
    public Cat(String kaind, String eat) {
        super(kaind, eat);
    }
    public void eat() {
        System.out.println("I am eating "+getEat());
    }
    public void makeSound() {
        System.out.println("Say rrr");
    }
    @Override
    public void bite() {
        System.out.println("I am bite");
    }

    public static void main(String[] args) {
        Cat lion1 = new Cat("lion", "meat");
        lion1.makeSound();
        lion1.eat();
        lion1.bite();
        System.out.println(lion1.toString());
        Cat lion2 = new Cat ("lion", "meat");
        System.out.println(lion1.equals(lion2));
    }
}