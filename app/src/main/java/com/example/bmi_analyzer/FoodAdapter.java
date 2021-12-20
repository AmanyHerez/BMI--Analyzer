package com.example.bmi_analyzer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    ArrayList<Food> foods;

    public FoodAdapter(ArrayList<Food> foods) {
        this.foods = foods;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.element_list_food,null,false);
        FoodHolder viewHolder=new FoodHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        Food food=foods.get(position);
        holder.iv_image.setImageResource(food.getImage());
        holder.tv_name.setText(food.getName());
        holder.tv_category.setText(food.getCategory());
        holder.tv_calory.setText(Integer.toString(food.getCalory()));

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public class FoodHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;
        TextView tv_name, tv_category, tv_calory;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            iv_image=itemView.findViewById(R.id.image_food);
            tv_name=itemView.findViewById(R.id.name_food);
            tv_category=itemView.findViewById(R.id.category);
            tv_calory=itemView.findViewById(R.id.calory);
        }
    }
}
