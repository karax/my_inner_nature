package com.jeankarax.myinnernature.view.mainmenu.vo;

import android.content.Context;

import com.jeankarax.myinnernature.view.DateUtilities;

public class PlantVO extends NatureVO{

    public String getLastTimeWatered(Context ctx) {
        return DateUtilities.lastDayWatered(ctx, getSchedules().get(1).getLastDate());
    }

}
