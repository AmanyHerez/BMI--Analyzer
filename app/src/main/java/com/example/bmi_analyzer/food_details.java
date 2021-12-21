package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class food_details extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
         spinner = findViewById(R.id.spinner_category);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Category,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String choice=adapterView.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),choice ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}