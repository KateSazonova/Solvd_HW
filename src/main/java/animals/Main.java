package animals;

import animals.animalsintrface.ICost;
import animals.animalsintrface.INotice;
import animals.exception.AvairyException;
import animals.exception.KaindException;
import animals.exception.NameException;
import animals.exception.SalaryException;
import animals.animalsintrface.IConverter;
import animals.animalsintrface.IInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static animals.Animal.collection;
import static animals.Position.WORKER;
import static animals.WorkingDay.MONDAY;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Antelope gazelle = new Antelope("gazelle", "grass");
        gazelle.makeSound();
        gazelle.bite();
        LOGGER.info(gazelle.toString());
        Antelope gnu = new Antelope("gnu", "grass");
        LOGGER.info(gazelle.equals(gnu));
        gnu.eat();
        Antelope impala = new Antelope("impala", "grass");
        try {
            impala.setKaind("");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        List<String> antelope = new LinkedList<>();
        antelope.add(String.valueOf(gazelle));
        antelope.add(String.valueOf(gnu));
        antelope.add(String.valueOf(impala));
        antelope.stream().filter(a -> a.startsWith("g")).forEach(a -> LOGGER.info(a));
        LOGGER.info("LinkedList=" + antelope);

        Bilet bilet1 = new Bilet("simple", 18);
        LOGGER.info(bilet1.getCategory() + bilet1.getPriсe());
        Bilet bilet2 = new Bilet("full", 10);
        try {
            bilet2.setCategory("preferential");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        Cat africanLion = new Cat("african lion", "meat");
        africanLion.makeSound();
        africanLion.bite();
        LOGGER.info(africanLion.toString());
        Cat whiteLion = new Cat("white lion", "chicken");
        LOGGER.info(africanLion.equals(whiteLion));
        africanLion.showInfo();
        africanLion.drink();
        Cat asianLion = new Cat("asian lion", "antelope");
        try {
            asianLion.setKaind("");
        } catch (KaindException e) {
            LOGGER.error(e.getMessage(), e);
        }

        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(africanLion);
        cats.add(whiteLion);
        cats.add(asianLion);
        cats.stream().forEach(c -> LOGGER.info(c));
        cats.remove(2);
        cats.stream().forEach(c -> LOGGER.info(c));
        collection(cats);


        Client jon = new Client("Jon");
        Zoo africa = new Zoo("Africa");
        jon.visited();
        Client sam = new Client("Sam");
        try {
            sam.setNameClient("");
        } catch (NameException e) {
            LOGGER.error(e.getMessage(), e);
        }


        Monkey gorilla = new Monkey("gorilla", "banana");
        gorilla.makeSound();
        gorilla.bite();
        LOGGER.info(gorilla.toString());
        Monkey macaque = new Monkey("macaque", "appel");
        LOGGER.info(gorilla.equals(macaque));
        Animal jocko = new Monkey("jocko", "peach");
        jocko.showInfo();

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(gorilla);
        monkeys.add(macaque);
        monkeys.add((Monkey) jocko);
        Set<Monkey> set = monkeys.stream().collect(Collectors.toSet());
        LOGGER.info(monkeys);

        Cat lion = new Cat("lion", "meat");
        Staff smith = new Staff("Smith");
        LOGGER.info("Staffer " + smith.getSurname() + " fed " + lion.getKaind());
        Zoo happy = new Zoo(3);
        LOGGER.info("Staffer " + smith.getSurname() + " moved " + lion.getKaind() + " from avairy " + happy.getAvairy());
        try {
            happy.setAvairy(5);
        } catch (AvairyException e) {
            LOGGER.error(e.getMessage(), e);
        }
        LOGGER.info(" to avairy " + happy.getAvairy());
        IInfo info1 = new Staff("Ivanov");
        info1.showInfo();

        Staff sidorov = new Staff();
        try {
            sidorov.setSalary(0);
        } catch (SalaryException e) {
            LOGGER.error(e.getMessage(), e);
        }
        LOGGER.info(sidorov.getSalary());

        Staff williams = new Staff();
        Staff peters = new Staff();
        Staff gibson = new Staff();


        HashSet<Staff> surname = new HashSet<>();
        surname.add(smith);
        surname.add(sidorov);
        surname.add(williams);
        surname.add(peters);
        surname.add(gibson);
        LOGGER.info(surname);

        Zoo nordic = new Zoo(3);
        happy.addAvairy(nordic);

        animals.LinkedList<String> zooNames = new animals.LinkedList<>();
        zooNames.addLast("Zoo#1");
        zooNames.addLast("Zoo#2");
        zooNames.addLast("Zoo#3");
        zooNames.addLast("Zoo#4");
        zooNames.addLast("Zoo#5");

        LOGGER.info(zooNames);

        WorkingDay monday = MONDAY;
        monday.toString();

        Position worker = WORKER;
        worker.getTelefon(WORKER);

        Type adult = Type.ADULT;
        adult.toString();

        INotice feedNotice = msg -> LOGGER.info(msg);
        feedNotice.sendNotice("Not feed animals");

        ICost totalCost;
        totalCost = ((x, y) -> x + y);
        int result = totalCost.calculateCost(50, 25);
        LOGGER.info(result);

        IConverter<Monkey, Antelope> converter = x -> new Antelope(x.getKaind(), x.getEat());
        gazelle = converter.convert(gorilla);
        LOGGER.info("Kaind-" + gazelle.getKaind() + " eat-" + gazelle.getEat());

        Staff staff = new Staff();
        Class clss = Staff.class;
        LOGGER.info(clss);
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            LOGGER.info(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                LOGGER.info(parameter.getName());
                LOGGER.info(parameter.getType().getName());
            }
        }
        ClientThread clientDay1 = new ClientThread();
        clientDay1.start();
        ClientThread clientDay2 = new ClientThread();
        clientDay2.start();

        Thread clientDay3 = new Thread(new ClientRunnable());
        Thread clientDay4 = new Thread(new ClientRunnable());
        clientDay3.start();
        clientDay4.start();
    }
}
