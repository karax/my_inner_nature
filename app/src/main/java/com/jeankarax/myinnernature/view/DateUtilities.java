package com.jeankarax.myinnernature.view;

import android.content.Context;

import com.jeankarax.myinnernature.R;

import java.util.Calendar;

public class DateUtilities {

    public static String lastDayWatered(Context ctx, Calendar calendar){
        Calendar today = Calendar.getInstance();
        String date;
        if (today.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH) == 1){
            date = ctx.getString(R.string.text_watered_yesterday, calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE));
        }else{
            date = ctx.getString(R.string.text_last_day_watered, calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.MONTH),calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
        }
        return date;
    }

    public static String nextDayToWater(Context ctx, Calendar calendar){
        Calendar today = Calendar.getInstance();
        String date;
        if (calendar.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_MONTH) == 1){
            date = ctx.getString(R.string.text_water_tomorrow);
        }else{
            date = ctx.getString(R.string.text_next_day_to_water, calendar.get(Calendar.DAY_OF_MONTH));
        }
        return date;
    }

}
