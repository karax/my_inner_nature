package com.jeankarax.myinnernature.view.plants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.databinding.FragmentPlantsListBinding;
import com.jeankarax.myinnernature.view.mainmenu.MainMenuViewModel;
import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;

import java.util.ArrayList;

public class PlantsListFragment extends Fragment {

    private MainMenuViewModel mViewModel;
    private ArrayList<PlantVO> mPlantsList;

    public PlantsListFragment(ArrayList<PlantVO> plantsList, MainMenuViewModel viewModel) {
        mViewModel = viewModel;
        mPlantsList = plantsList;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentPlantsListBinding plantsListBinding;
        plantsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_plants_list, container, false);
        return plantsListBinding.getRoot();
    }
}
