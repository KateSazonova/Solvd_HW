package animals;

import animals.exception.NameException;
import animals.animalsintrface.IInfo;
import animals.animalsintrface.IVisit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client implements IVisit, IInfo {
    private static final Logger LOGGER = LogManager.getLogger(Client.class);
    private int number;
    private String nameClient;

    public Client(int number) {
        this.number = number;
    }

    public Client(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getNumber() {
        return number;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNameClient(String nameClient) throws NameException {
        if (nameClient.length() < 1) {
            throw new NameException("enter name");
        }
        this.nameClient = nameClient;
    }

    @Override
    public void takeFoto() {
        LOGGER.info(getNameClient() + " take foto");
    }

    @Override
    public void buy() {
        LOGGER.info(getNameClient() + " buy");
    }

    @Override
    public void showInfo() {
        LOGGER.info(getNumber());
    }

    public void visited() {
        LOGGER.info("Visiter " + getNameClient() + " visited Zoo");
    }
}
