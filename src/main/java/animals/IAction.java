package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface IAction {
    static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    public default void drink() {
        LOGGER.info("I drink water");
    }

    public default void sleep(){
        LOGGER.info("I am sliping now");
    }
}
