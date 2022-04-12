package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Zoo implements IInfo {
    private static String nameZoo;
    private static int avairy;

    public Zoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public Zoo(int avairy) {
        this.avairy = avairy;
    }

    public static String getNameZoo() {
        return nameZoo;
    }

    public static int getAvairy() {
        return avairy;
    }

    public void setNameZoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public void setAvairy(int avairy) throws AvairyException {
        if (avairy<=0){
            throw new AvairyException("incorrect");
        }

        this.avairy = avairy;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    public static void addAvairy() {
        LOGGER.info(getAvairy() + 1);
    }

    @Override
    public void showInfo() {
        LOGGER.info(getNameZoo());
    }

    public static void main(String[] args) {
        Zoo happy = new Zoo(3);
        happy.addAvairy();

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addLast("Zoo#1");
        linkedList.addLast("Zoo#2");
        linkedList.addLast("Zoo#3");
        linkedList.addLast("Zoo#4");
        linkedList.addLast("Zoo#5");
        LOGGER.info(linkedList);
    }


}

