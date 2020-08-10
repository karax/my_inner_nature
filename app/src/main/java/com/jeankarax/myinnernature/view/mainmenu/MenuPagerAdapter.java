package com.jeankarax.myinnernature.view.mainmenu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jeankarax.myinnernature.view.plants.PlantsListFragment;
import com.jeankarax.myinnernature.view.yeasts.YeastsListFragment;

public class MenuPagerAdapter extends FragmentStateAdapter {

    MainMenuViewModel mViewModel;

    public MenuPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, MainMenuViewModel viewModel) {
        super(fragmentManager, lifecycle);
        mViewModel = viewModel;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new PlantsListFragment(mViewModel.getPlantList());
            case 1:
                return new YeastsListFragment(mViewModel.getYeastList(), mViewModel);
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
