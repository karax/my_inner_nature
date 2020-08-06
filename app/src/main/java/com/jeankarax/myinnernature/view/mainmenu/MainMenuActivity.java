package com.jeankarax.myinnernature.view.mainmenu;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Toast;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.databinding.ActivityMainMenuBinding;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

/**
 * Created by Jean Karax on 13/07/2020.
 */
public class MainMenuActivity extends FragmentActivity {

    private ActivityMainMenuBinding binding;

    MenuPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainMenuViewModel viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainMenuViewModel.class);
        pagerAdapter= new MenuPagerAdapter(getSupportFragmentManager(), getLifecycle(), viewModel);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_menu);

        bindComponents();
    }

    private void bindComponents() {
        binding.vpLists.setAdapter(pagerAdapter);

        binding.llMyFermentations.setOnClickListener( view -> {
            animateIcons();
            binding.vpLists.setVisibility(View.VISIBLE);
            binding.vpLists.setCurrentItem(1);
        });
        binding.llMyPlants.setOnClickListener(view -> {
            animateIcons();
            binding.vpLists.setVisibility(View.VISIBLE);
            binding.vpLists.setCurrentItem(0);
        });
        binding.ibAddButton.setOnClickListener(view -> {
            Toast.makeText(this, "Novo item", Toast.LENGTH_SHORT).show();
        });

        binding.ivPlantTab.setOnClickListener(view -> {
            binding.vpLists.setCurrentItem(0);

        });

        binding.ivFermentationTab.setOnClickListener(view -> {
            binding.vpLists.setCurrentItem(1);
            
        });
    }

    @Override
    public void onBackPressed() {
        binding.vpLists.setVisibility(View.GONE);
        resetIcons();
    }

    private void resetIcons() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorFermentationX = ObjectAnimator.ofFloat(binding.llMyFermentations, "translationX", 0f);
        ObjectAnimator animatorFermentationY = ObjectAnimator.ofFloat(binding.llMyFermentations, "translationY", 0f);
        ObjectAnimator animatorPlantX = ObjectAnimator.ofFloat(binding.llMyPlants, "translationX", 0f);
        ObjectAnimator animatorPlantY = ObjectAnimator.ofFloat(binding.llMyPlants, "translationY", 0f);
        animatorSet.playTogether(animatorFermentationX, animatorFermentationY, animatorPlantX, animatorPlantY);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.setDuration(100);
        animatorSet.start();
        binding.llMyPlants.setVisibility(View.VISIBLE);
        binding.llMyFermentations.setVisibility(View.VISIBLE);
        binding.ivFermentationTab.setVisibility(View.GONE);
        binding.ivPlantTab.setVisibility(View.GONE);
    }

    private void animateIcons() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorFermentationX = ObjectAnimator.ofFloat(binding.llMyFermentations, "translationX", 300f);
        ObjectAnimator animatorFermentationY = ObjectAnimator.ofFloat(binding.llMyFermentations, "translationY", 600f);
        ObjectAnimator animatorPlantX = ObjectAnimator.ofFloat(binding.llMyPlants, "translationX", -300f);
        ObjectAnimator animatorPlantY = ObjectAnimator.ofFloat(binding.llMyPlants, "translationY", 1000f);
        animatorSet.playTogether(animatorFermentationX, animatorFermentationY, animatorPlantX, animatorPlantY);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.setDuration(100);
        animatorSet.start();
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            binding.llMyPlants.setVisibility(View.GONE);
            binding.llMyFermentations.setVisibility(View.GONE);
            binding.ivFermentationTab.setVisibility(View.VISIBLE);
            binding.ivPlantTab.setVisibility(View.VISIBLE);
            }, 100);
    }
}
