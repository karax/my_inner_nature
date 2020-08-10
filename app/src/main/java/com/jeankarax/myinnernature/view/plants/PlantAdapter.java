package com.jeankarax.myinnernature.view.plants;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;

import java.util.ArrayList;

public class PlantAdapter extends RecyclerView.Adapter<PlantViewHolder> {

    private ArrayList<PlantVO> plantsList;

    public PlantAdapter(ArrayList<PlantVO> plantsList) {
        this.plantsList = plantsList;
    }

    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlantViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.plant_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
        holder.bind(plantsList.get(position));
        holder.setLastItem(position==plantsList.size()-1);
    }

    @Override
    public int getItemCount() {
        return plantsList.size();
    }

    public void editPlant(Context context, int position) {
        //TODO Open edit plant activity
        Toast.makeText(context, "Edit" + plantsList.get(position).getName(), Toast.LENGTH_SHORT).show();
    }

    public void deletePlant(Context context, int position) {
        //TODO Remove plant from list
        Toast.makeText(context, "Delete " + plantsList.get(position).getName(), Toast.LENGTH_SHORT).show();
    }
}
