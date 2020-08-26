package com.jeankarax.myinnernature.view.mainmenu;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.jeankarax.myinnernature.view.DateUtilities;
import com.jeankarax.myinnernature.view.mainmenu.vo.NatureSchedule;
import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;
import com.jeankarax.myinnernature.view.mainmenu.vo.YeastVO;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MainMenuViewModel extends AndroidViewModel {

    public MutableLiveData<ArrayList<YeastVO>> yeastListMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<ArrayList<PlantVO>> plantListMutableLiveData = new MutableLiveData<>();

    public MainMenuViewModel(@NonNull Application application) {
        super(application);
    }


    public ArrayList<PlantVO> getPlantList(){
        return plantListMutableLiveData.getValue();
    }

    public ArrayList<YeastVO> getYeastList(){
        return null;
    }

    public void fetchLists() {
        plantListMutableLiveData.setValue(getPlantsListMock());
    }

    private ArrayList<PlantVO> getPlantsListMock() {
        PlantVO plant1 = new PlantVO();
        PlantVO plant2 = new PlantVO();
        ArrayList<PlantVO> plantsList = new ArrayList<>();


        NatureSchedule schedule1 = new NatureSchedule();
        Calendar lastDate1 = Calendar.getInstance();
        lastDate1.set(Calendar.DATE, 30);
        schedule1.setLastDate(lastDate1);
        Calendar nextDate1 = Calendar.getInstance();
        nextDate1.set(Calendar.DATE, 9);
        schedule1.setNextDate(nextDate1);

        NatureSchedule schedule12 = new NatureSchedule();
        Calendar lastDate12 = Calendar.getInstance();
        lastDate12.set(Calendar.DATE, 30);
        schedule12.setLastDate(lastDate1);
        Calendar nextDate12 = Calendar.getInstance();
        nextDate12.set(Calendar.DATE, 9);
        schedule12.setNextDate(nextDate1);

        NatureSchedule schedule2 = new NatureSchedule();
        Calendar lastDate2 = Calendar.getInstance();
        lastDate2.set(Calendar.DATE, 9);
        schedule2.setLastDate(lastDate2);
        Calendar nextDate2 = Calendar.getInstance();
        nextDate2.set(Calendar.DATE, 30);
        schedule2.setLastDate(nextDate2);

        Map<Integer, NatureSchedule> schedules1 = new HashMap<>();
        schedules1.put(NatureSchedule.ScheduleType.WATER.getValue(), schedule1);
        schedules1.put(NatureSchedule.ScheduleType.FERTILIZE.getValue(), schedule12);

        Map<Integer, NatureSchedule> schedules2 = new HashMap<>();
        schedules2.put(NatureSchedule.ScheduleType.WATER.getValue(), schedule2);

        plant1.setName("Planta 1");
        plant1.setSchedules(schedules1);

        plant2.setName("Planta 2");
        plant2.setSchedules(schedules2);

        plantsList.add(plant1);
        plantsList.add(plant2);

        return plantsList;
    }
}
