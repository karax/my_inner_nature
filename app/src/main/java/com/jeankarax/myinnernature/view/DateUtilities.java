package com.jeankarax.myinnernature.view;

import android.content.Context;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.view.mainmenu.vo.NatureSchedule;

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

    public static String getScheduleText(Context ctx, Calendar calendar, String action){
        Calendar today = Calendar.getInstance();
        String date;
        if (calendar.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_MONTH) == 1){
            date = ctx.getString(R.string.text_schedule_tomorrow, action);
        }else{
            date = ctx.getString(R.string.text_next_day_schedule, action, calendar.get(Calendar.DAY_OF_MONTH));
        }
        return date;
    }

    public static String nextSchedule(Context ctx, Calendar nextDate, Integer action){
        Calendar today = Calendar.getInstance();
        String scheduleText = "";
        if (nextDate.get(Calendar.MONTH) == today.get(Calendar.MONTH) &&
                (nextDate.get(Calendar.DAY_OF_MONTH) - today.get(Calendar.DAY_OF_MONTH)) < 8) {
            switch (action){
                case 1:
                    //Water
                    scheduleText = getScheduleText(ctx, nextDate, ctx.getString(R.string.text_water_action));
                    break;
                case 2:
                    //Fertilize
                    scheduleText = getScheduleText(ctx, nextDate, ctx.getString(R.string.text_fertilize_action));
                    break;
                case 3:
                    //Prune
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_prune_action));
                    break;
                case 4:
                    //Sprinkle
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_sprinkle_action));
                    break;
                case 5:
                    //Fungicide
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_fungicide_action));
                    break;
                case 6:
                    //Pesticide
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_pesticide_action));
                    break;
                case 7:
                    //Weed
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_weed_action));
                    break;
                case 8:
                    //Replant
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_replant_action));
                    break;
                case 9:
                    //Seed
                    getScheduleText(ctx, nextDate, ctx.getString(R.string.text_seed_action));
                    break;
                default:
                    scheduleText = "";
                    break;
            }
        }
        return scheduleText;
    }

}
