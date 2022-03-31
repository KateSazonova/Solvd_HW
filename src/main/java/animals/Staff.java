package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class Staff implements IPayment, IInfo {
    private int salary;
    private String surname;
    private String position;

    public Staff(int salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public Staff(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(int salary) throws SalaryException {
        if (salary <= 0) {
            throw new SalaryException("not correct");
        }
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    @Override
    public void work() {
        System.out.println("Works like " + getPosition());
    }

    @Override
    public void getpayment() {
        System.out.println(getPosition() + " get salary = " + getSalary() + " in a month");
    }


    @Override
    public void getPremium() {
        System.out.println(getSurname() + " get premium " + getSalary() * 2);
    }


    @Override
    public void showInfo() {
        System.out.println(getSurname());
    }

    public static void main(String[] args) {
        Cat lion = new Cat("lion", "meat");
        Staff smith = new Staff("Smith");
        System.out.println("Staffer " + smith.getSurname() + " fed " + lion.getKaind());
        Zoo happy = new Zoo(3);
        System.out.print("Staffer " + smith.getSurname() + " moved " + lion.getKaind() + " from avairy " + happy.getAvairy());
        try {
            happy.setAvairy(5);
        } catch (AvairyException e) {
            LOGGER.error(e.getMessage(), e);
        }
        System.out.println(" to avairy " + happy.getAvairy());
        IInfo info1 = new Staff("Ivanov");
        info1.showInfo();

        Staff sidorov = new Staff(500, "worker");
        try {
            sidorov.setSalary(0);
        } catch (SalaryException e) {
            LOGGER.error(e.getMessage(), e);
        }
        System.out.println(sidorov.getSalary());

        Staff williams = new Staff(1000, "trainer");
        Staff peters = new Staff(400,"salesman");
        Staff gibson = new Staff(400,"salesman");


        HashSet<Staff> hashSet=new HashSet<>();
        hashSet.add(smith);
        hashSet.add(sidorov);
        hashSet.add(williams);
        hashSet.add(peters);
        hashSet.add(gibson);

        System.out.println(hashSet);

    }
}