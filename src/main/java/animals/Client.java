package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client implements IVisit, IInfo {
    private int number;
    private static String nameClient;

    public Client(int number) {
        this.number = number;
    }

    public Client(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getNumber() {
        return number;
    }

    public static String getNameClient() {
        return nameClient;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNameClient(String nameClient) throws NameException {
        if(nameClient.length()<1){
            throw new NameException("enter name");
        }
        this.nameClient = nameClient;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
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

    public static void visited() {
        LOGGER.info("Visiter " + getNameClient() + " visited Zoo " + Zoo.getNameZoo());
    }

    public static void main(String[] args) {
        Client jon = new Client("Jon");
        Zoo africa = new Zoo("Africa");
        visited();
        Client sam = new Client ("Sam");
        try {
            sam.setNameClient("l");
        } catch (NameException e) {
            e.printStackTrace();
        }
    }
}
