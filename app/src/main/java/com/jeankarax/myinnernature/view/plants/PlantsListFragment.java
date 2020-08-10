package com.jeankarax.myinnernature.view.plants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.databinding.FragmentPlantsListBinding;
import com.jeankarax.myinnernature.view.mainmenu.MainMenuViewModel;
import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;

import java.util.ArrayList;

public class PlantsListFragment extends Fragment {

    private ArrayList<PlantVO> mPlantsList;
    private FragmentPlantsListBinding plantsListBinding;
    private PlantAdapter plantAdapter;
    private LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

    public PlantsListFragment(ArrayList<PlantVO> plantsList) {
        mPlantsList = plantsList;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        plantsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_plants_list, container, false);
        plantAdapter = new PlantAdapter(mPlantsList);
        bindComponents();
        return plantsListBinding.getRoot();
    }

    private void bindComponents() {
        plantsListBinding.rvPlantsList.setLayoutManager(layoutManager);
        plantsListBinding.rvPlantsList.setAdapter(plantAdapter);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                plantAdapter.editPlant(getContext(), item.getGroupId());
                return true;
            case 2:
                plantAdapter.deletePlant(getContext(), item.getGroupId());
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
