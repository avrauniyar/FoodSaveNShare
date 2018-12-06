package com.avrauniyar03.foodsavenshare;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.FoodViewHolder> {

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itme, viewGroup, false);
        FoodViewHolder fvh = new FoodViewHolder(v);
        return fvh;    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder foodViewHolder, int i) {
        foodViewHolder.foodName.setText(foodInfos.get(i).getFoodName());
        foodViewHolder.foodQuantity.setText(foodInfos.get(i).getFoodCount());
        foodViewHolder.foodDate.setText(foodInfos.get(i).getDate());
        foodViewHolder.foodTime.setText(foodInfos.get(i).getTime());

    }

    @Override
    public int getItemCount() {
        return foodInfos.size() ;
    }

    List<FoodInfo> foodInfos;

    RVAdapter(List<FoodInfo> foodInfos){
        this.foodInfos = foodInfos;
    }
    public static class FoodViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView foodName;
        TextView foodQuantity;
        TextView foodDate;
        TextView foodTime;

        FoodViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            foodName = (TextView)itemView.findViewById(R.id.food_name);
            foodQuantity = (TextView)itemView.findViewById(R.id.food_quantity);
            foodDate = (TextView)itemView.findViewById(R.id.pickup_date);
            foodTime = (TextView)itemView.findViewById(R.id.pickup_time);

        }
    }
}
