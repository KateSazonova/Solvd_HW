package animals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum WorkingDay {
    MONDAY("day off"), TUESDAY("11:00-18:00"), WENESDAY("11:00-18:00"), THURSDAY("11:00-18:00"), FRIDAY("10:00-20:00"), SATURDAY("9:00-21:00"), SUNDAY("9:00-21:00");
    private static final Logger LOGGER = LogManager.getLogger(WorkingDay.class);
    private String workingHours;

    WorkingDay(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getworkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        LOGGER.info(getworkingHours());
        return null;
    }
}



