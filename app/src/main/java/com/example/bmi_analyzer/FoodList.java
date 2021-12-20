package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FoodList extends AppCompatActivity {
    RecyclerView recycle_view_food;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        recycle_view_food=findViewById(R.id.recycle_view_food);
        ArrayList<Food> Foods=new ArrayList<>();
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));
        Foods.add(new Food(R.drawable.food,"apple","Fruit",170));




        FoodAdapter adapter=new FoodAdapter(Foods);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        recycle_view_food.setHasFixedSize(true);
        recycle_view_food.setLayoutManager(lm);
        recycle_view_food.setAdapter(adapter);
    }


}