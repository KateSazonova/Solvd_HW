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
        Antelope gazelle = new Antelope("gazelle", "grass");
        gazelle.makeSound();
        gazelle.eat();
        gazelle.bite();
    }
}
