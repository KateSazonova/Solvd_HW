package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum Position {
    WORKER, CLEANER, VETERINARIAN, ADMINISTRATION, CASHIER;
    private static final Logger LOGGER = LogManager.getLogger(Position.class);

    public void getTelefon(Position position) {
        switch (position) {
            case WORKER:
                LOGGER.info("+375291234567");
                break;
        }
        switch (position) {
            case CLEANER:
                LOGGER.info("+375291234561");
                break;
        }
        switch (position) {
            case VETERINARIAN:
                LOGGER.info("+375291234562");
                break;
        }
        switch (position) {
            case ADMINISTRATION:
                LOGGER.info("+375291234563");
                break;
        }
        switch (position) {
            case CASHIER:
                LOGGER.info("+375291234564");
                break;
        }
    }
}


