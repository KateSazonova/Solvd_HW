package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum WorkingDay {Monday("day off"), Tuesday("11:00-18:00"), Wednesday("11:00-18:00"), Thursday("11:00-18:00"), Friday("10:00-20:00"), Saturday("9:00-21:00"), Sunday("9:00-21:00");
    private String workingHours;
    WorkingDay(String workingHours) {
        this.workingHours = workingHours;
    }
    public String getworkingHours() {
        return workingHours;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);
    public void showHours(WorkingDay workingHours){
        switch (workingHours){
            case Monday:
                LOGGER.info(getworkingHours());
                break;
            case Tuesday:
                LOGGER.info(getworkingHours());
                break;
            case Wednesday:
                LOGGER.info(getworkingHours());
                break;
            case Friday:
                LOGGER.info(getworkingHours());
                break;
            case Saturday:
                LOGGER.info(getworkingHours());
                break;
            case Sunday:
                LOGGER.info(getworkingHours());
                break;
        }
    }

    }



