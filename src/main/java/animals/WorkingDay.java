package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum WorkingDay {MONDAY("day off"), TUESDAY("11:00-18:00"), WENESDAY("11:00-18:00"), THURSDAY("11:00-18:00"), FRIDAY("10:00-20:00"), SATURDAY("9:00-21:00"), SUNDAY("9:00-21:00");
    private String workingHours;
    WorkingDay(String workingHours) {
        this.workingHours = workingHours;
    }
    public String getworkingHours() {
        return workingHours;
    }
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public static void main(String[] args) {
        LOGGER.info(MONDAY.getworkingHours());
    }
    }



