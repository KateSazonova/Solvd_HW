package animals;

import java.util.LinkedList;
import java.util.Objects;

abstract public class Animal implements IInfo, IAction, IProblem {
    private String kaind;
    private String eat;

    public Animal(String kaind, String eat) {
        this.kaind = kaind;
        this.eat = eat;
    }

    public Animal(String kaind) {
        this.kaind = kaind;
    }

    public String getKaind() {
        return kaind;
    }

    public String getEat() {
        return eat;
    }

    public void setKaind(String kaind) throws KaindException {
        if (kaind == "") {
            throw new KaindException("enter kaind");
        }
        this.kaind = kaind;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public final void eat() {
        System.out.println("I am eating ");
    }

    @Override
    public String toString() {
        return getKaind() + " eat " + getEat();
    }

    public abstract void makeSound();

    public void bite() {
        System.out.println("I am not bite");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(kaind, animal.kaind) && Objects.equals(eat, animal.eat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kaind, eat);
    }

    public static void collection(LinkedList<? extends Animal> linkedList) {
        for (Animal animal : linkedList) {
            animal.eat();
        }
    }
}
