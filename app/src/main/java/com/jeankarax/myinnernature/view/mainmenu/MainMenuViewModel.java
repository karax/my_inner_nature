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
        return null;
    }

    public ArrayList<YeastVO> getYeastList(){
        return null;
    }
}
