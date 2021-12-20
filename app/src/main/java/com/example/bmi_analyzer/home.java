package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    RecyclerView recycle_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recycle_view=findViewById(R.id.recycle_view);
        ArrayList<BMIRecord> Records=new ArrayList<>();
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));
        Records.add(new BMIRecord("13/1/2000",65,"Normal",170));

        BMIAdapter adapter=new BMIAdapter(Records);
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        recycle_view.setHasFixedSize(true);
        recycle_view.setLayoutManager(lm);
        recycle_view.setAdapter(adapter);

    }
}