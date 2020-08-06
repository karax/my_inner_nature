package com.jeankarax.myinnernature.view.yeasts;

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
import com.jeankarax.myinnernature.databinding.FragmentYeastsListBinding;
import com.jeankarax.myinnernature.view.mainmenu.MainMenuViewModel;
import com.jeankarax.myinnernature.view.mainmenu.vo.YeastVO;

import java.util.ArrayList;

public class YeastsListFragment extends Fragment {

    ArrayList<YeastVO> mYeastList;
    MainMenuViewModel mViewModel;

    public YeastsListFragment(ArrayList<YeastVO> yeastList, MainMenuViewModel viewModel) {
        mYeastList = yeastList;
        mViewModel = viewModel;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentYeastsListBinding yeastsListBinding;
        yeastsListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_yeasts_list, container, false);
        return yeastsListBinding.getRoot();
    }
}
