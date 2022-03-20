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
        Cat lion = new Cat("lion", "meat");
        lion.makeSound();
        lion.eat();
        lion.bite();
    }
}