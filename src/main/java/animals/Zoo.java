package animals;

import animals.exception.AvairyException;
import animals.animalsintrface.IInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Zoo implements IInfo {
    private String nameZoo;
    private int avairy;

    public Zoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public Zoo(int avairy) {
        this.avairy = avairy;
    }

    public String getNameZoo() {
        return nameZoo;
    }

    public int getAvairy() {
        return avairy;
    }

    public void setNameZoo(String nameZoo) {
        this.nameZoo = nameZoo;
    }

    public void setAvairy(int avairy) throws AvairyException {
        if (avairy <= 0) {
            throw new AvairyException("incorrect");
        }

        this.avairy = avairy;
    }

    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public void addAvairy(Zoo nordic) {
        LOGGER.info(getAvairy() + 1);
    }

    @Override
    public void showInfo() {
        LOGGER.info(getNameZoo());
    }


}

