abstract public class Animal {
    private static String kaind;
    private String eat;
    public Animal(String kaind, String eat) {
        this.kaind = kaind;
        this.eat = eat;
    }
    public Animal(String kaind) {
        this.kaind = kaind;
    }
    public static String getKaind() {
        return kaind;
    }
    public String getEat() {
        return eat;
    }
    public void setKaind(String kaind) {
        this.kaind = kaind;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
    public void eat() {
        System.out.println("I am eating");
    }
    public abstract void makeSound ();
    public void bite() {
        System.out.println("I am not bite");
    }
}
