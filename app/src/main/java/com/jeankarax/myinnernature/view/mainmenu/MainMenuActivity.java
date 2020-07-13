package com.jeankarax.myinnernature.view.mainmenu;

import android.os.Bundle;
import android.widget.Toast;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.databinding.ActivityMainMenuBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

/**
 * Created by Jean Karax on 13/07/2020.
 */
public class MainMenuActivity extends AppCompatActivity {

    private ActivityMainMenuBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_menu);
        binding.llMyFermentations.setOnClickListener( listener -> {
            Toast.makeText(this, "Fermentações", Toast.LENGTH_SHORT).show();
        });
        binding.llMyPlants.setOnClickListener(listener -> {
            Toast.makeText(this, "Plantas", Toast.LENGTH_SHORT).show();
        });
        binding.ibAddButton.setOnClickListener(listener -> {
            Toast.makeText(this, "Novo item", Toast.LENGTH_SHORT).show();
        });

    }
}
