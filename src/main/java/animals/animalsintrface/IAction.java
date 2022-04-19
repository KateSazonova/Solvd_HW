package animals.animalsintrface;

import animals.LoggerRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IAction {
    Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    default void drink() {
        LOGGER.info("I drink water");
    }

    default void sleep(){
        LOGGER.info("I am sliping now");
    }
}
