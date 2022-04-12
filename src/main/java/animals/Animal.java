package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        if (kaind.equals("")) {
            throw new KaindException("enter kaind");
        }
        this.kaind = kaind;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public final void eat() {
        LOGGER.info("I am eating ");
    }

    @Override
    public String toString() {
        return getKaind() + " eat " + getEat();
    }

    public abstract void makeSound();

    public void bite() {
        LOGGER.info("I am not bite");
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
