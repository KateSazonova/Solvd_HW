package animals;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerRunner {
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public static void main(String[] args) {
        LOGGER.info("LOGGER INFO");
        LOGGER.error("LOGGER ERROR");
        LOGGER.debug("LOGGER DEBUG");
    }
}
