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
import com.jeankarax.myinnernature.databinding.FragmentMainMenuBinding;
import com.jeankarax.myinnernature.databinding.FragmentPlantsListBinding;
import com.jeankarax.myinnernature.databinding.FragmentYeastsListBinding;

public class PlantsListFragment extends Fragment {

    int page;

    public PlantsListFragment(int page) {
        this.page = page;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentPlantsListBinding plantsListBinding;
        FragmentYeastsListBinding yeastsListBinding;
        FragmentMainMenuBinding mainMenuBinding;
        View view;

        switch (page){
            case 1:
                plantsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_plants_list, container, false);
                view = plantsListBinding.getRoot();
                break;
            case 2:
                yeastsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_yeasts_list, container, false);
                view = yeastsListBinding.getRoot();
                break;
            default:
                mainMenuBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_menu, container, false);
                view = mainMenuBinding.getRoot();
                break;
        }
        return view;
    }
}
