package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class new_record extends AppCompatActivity {
    Button weight_increase,weight_decrease, length_increase, length_decrease;
    EditText w_number, l_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        weight_increase = findViewById(R.id.w_increment);
        w_number = findViewById(R.id.display_w_number);
        weight_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w_in = Integer.parseInt(w_number.getText().toString());
                w_in += 1;
                w_number.setText(w_in+"");
            }
        });
        weight_decrease = findViewById(R.id.w_decrement);
        w_number = findViewById(R.id.display_w_number);
        weight_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w_dec = Integer.parseInt(w_number.getText().toString());
                w_dec -= 1;
                w_number.setText(w_dec+"");
            }
        });
        length_increase = findViewById(R.id.l_increment);
        l_number = findViewById(R.id.display_l_number);
        length_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int l_in = Integer.parseInt(l_number.getText().toString());
                l_in += 1;
                l_number.setText(l_in+"");
            }
        });
        length_decrease = findViewById(R.id.l_decrement);
        l_number = findViewById(R.id.display_l_number);
        length_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int l_dec = Integer.parseInt(l_number.getText().toString());
                l_dec -= 1;
                l_number.setText(l_dec+"");
            }
        });


    }
}