package main.java;

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
            e.printStackTrace();
        }
        System.out.println(" to avairy " + happy.getAvairy());
        IInfo info1 = new Staff("Ivanov");
        info1.showInfo();

        Staff sidorov = new Staff(8, "worker");
        try {
            sidorov.setSalary(0);
        } catch (SalaryException e) {
            e.printStackTrace();
        }
        System.out.println(sidorov.getSalary());
    }
}