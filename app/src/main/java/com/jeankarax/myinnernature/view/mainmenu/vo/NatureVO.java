package com.jeankarax.myinnernature.view.mainmenu.vo;

import java.util.Map;

public class NatureVO {
    private String name;
    private Map<Integer, NatureSchedule> schedules;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, NatureSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(Map<Integer, NatureSchedule> schedules) {
        this.schedules = schedules;
    }
}
