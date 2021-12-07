package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    RecyclerView recycler_view;
    BMIRecordsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_view=findViewById(R.id.recycler_view);
        setRecyclerView();
    }
    private void setRecyclerView() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter=new BMIRecordsAdapter(this,getList());
        recycler_view.setAdapter(adapter);

    }

    private ArrayList<BMIRecord> getList() {
        ArrayList<BMIRecord> records=new ArrayList<>();
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        records.add(new BMIRecord("13/1/2000",65,176));
        return records;
    }
}