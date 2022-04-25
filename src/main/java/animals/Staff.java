package animals;

import animals.exception.SalaryException;
import animals.animalsintrface.IInfo;
import animals.animalsintrface.IPayment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Staff implements IPayment, IInfo {
    private static final Logger LOGGER = LogManager.getLogger(Staff.class);
    private int salary;
    private String surname;
    private String position;

    public Staff() {
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
        LOGGER.info("Works like " + getPosition());
    }

    @Override
    public void getpayment() {
        LOGGER.info(getPosition() + " get salary = " + getSalary() + " in a month");
    }


    @Override
    public void getPremium() {
        LOGGER.info(getSurname() + " get premium " + getSalary() * 2);
    }


    @Override
    public void showInfo() {
        LOGGER.info(getSurname());
    }

}