package com.jeankarax.myinnernature.view.mainmenu;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;
import com.jeankarax.myinnernature.view.mainmenu.vo.YeastVO;

import java.util.ArrayList;

public class MainMenuViewModel extends ViewModel {

    public MutableLiveData<ArrayList<YeastVO>> yeastListMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<ArrayList<PlantVO>> plantListMutableLiveData = new MutableLiveData<>();

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
        ArrayList<PlantVO> plantsList= new ArrayList<>();

        plant1.setName("Planta 1");
        plant1.setLastTimeWatered("Ontem, às 13:30");

        plant2.setName("Planta 2");
        plant2.setLastTimeWatered("Ultimo dia 1 de Agosto, às 13:30");

        plantsList.add(plant1);
        plantsList.add(plant2);

        return plantsList;
    }
}
