package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(Staff.class);
    @Override
    public void run() {
        for (int i=0; i<50; i++){
            LOGGER.info(Thread.currentThread().getName()+ " "+ i);
        }
    }
}
