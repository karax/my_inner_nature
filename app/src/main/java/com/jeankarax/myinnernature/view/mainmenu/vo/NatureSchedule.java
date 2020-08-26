package com.jeankarax.myinnernature.view.mainmenu.vo;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class NatureSchedule {
    private Calendar lastDate;
    private Calendar nextDate;
    private Boolean isUpToDate;

    public Calendar getLastDate() {
        return lastDate;
    }

    public void setLastDate(Calendar lastDate) {
        this.lastDate = lastDate;
    }

    public Calendar getNextDate() {
        return nextDate;
    }

    public void setNextDate(Calendar nextDate) {
        this.nextDate = nextDate;
    }

    public Boolean getUpToDate() {
        return isUpToDate;
    }

    public void setUpToDate(Boolean upToDate) {
        isUpToDate = upToDate;
    }

    public enum ScheduleType{
        WATER(1),
        FERTILIZE(2),
        PRUNE(3),
        SPRINKLE(4),
        FUNGICIDE(5),
        PESTICIDE(6),
        WEED(7),
        REPLANT(8),
        SEED(9);

        private int value;
        private static Map map = new HashMap<>();

        ScheduleType(int i) {
            this.value = i;
        }

        static {
            for (ScheduleType scheduleType : ScheduleType.values()) {
                map.put(scheduleType.value, scheduleType);
            }
        }

        public static ScheduleType valueOf(int scheduleType) {
            return (ScheduleType) map.get(scheduleType);
        }

        public int getValue() {
            return value;
        }
    }
}
