package com.jeankarax.myinnernature.view.mainmenu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jeankarax.myinnernature.view.plants.PlantsListFragment;

public class NaturePagerAdapter extends FragmentStateAdapter {

    public NaturePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new PlantsListFragment(position);
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
