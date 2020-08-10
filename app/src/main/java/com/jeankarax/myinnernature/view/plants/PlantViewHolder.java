package com.jeankarax.myinnernature.view.plants;

import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeankarax.myinnernature.R;
import com.jeankarax.myinnernature.view.mainmenu.vo.PlantVO;

public class PlantViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener{

    private ImageView ivPlantPic;
    private TextView tvPlantName;
    private TextView tvLastTimeWatered;
    private LinearLayout llSchedules;
    private ImageButton ibItemOptions;
    private View vDivider;


    public PlantViewHolder(@NonNull View itemView) {
        super(itemView);

        ivPlantPic = (ImageView) itemView.findViewById(R.id.iv_plant_pic);
        tvPlantName = (TextView) itemView.findViewById(R.id.tv_plant_name);
        tvLastTimeWatered = (TextView) itemView.findViewById(R.id.tv_last_time_watered);
        llSchedules = (LinearLayout) itemView.findViewById(R.id.ll_schedules);
        ibItemOptions = (ImageButton) itemView.findViewById(R.id.ib_item_options);
        vDivider = (View) itemView.findViewById(R.id.v_divider);

    }

    public void bind(PlantVO plantVO){
        //TODO set image
        tvPlantName.setText(plantVO.getName());
        tvLastTimeWatered.setText(plantVO.getLastTimeWatered());
        //TODO implement schedules
        ibItemOptions.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.getAdapterPosition(), 1, 0, "Editar");
        contextMenu.add(this.getAdapterPosition(), 2, 1, "Excluir");
    }

    public void setLastItem(boolean b) {
        vDivider.setVisibility(b? View.GONE: View.VISIBLE);
    }
}
