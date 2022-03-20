public class Antelope extends Animal{
    public Antelope(String kaind, String eat) {
        super(kaind, eat);
    }
    public void eat() {
        System.out.println("I am eating "+getEat());
    }
    public void makeSound() {
        System.out.println("Say igogo");
    }
    @Override
    public void bite() {
        System.out.println("I am bite");
    }
    public static void main(String[] args) {
        Antelope gazelle1 = new Antelope("gazelle", "grass");
        gazelle1.makeSound();
        gazelle1.eat();
        gazelle1.bite();
        System.out.println(gazelle1.toString());
        Antelope gazelle2 = new Antelope("gazelle", "grass");
        System.out.println(gazelle1.equals(gazelle2));
    }
}
