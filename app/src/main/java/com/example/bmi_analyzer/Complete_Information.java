package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Complete_Information extends AppCompatActivity {
    RadioButton Male, Female;
    Button weight_increase,weight_decrease, length_increase, length_decrease;
    EditText w_number, l_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_information);
        Male = findViewById(R.id.male);
        Female = findViewById(R.id.female);


        Male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean gender) {
                if (gender)
                    Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getBaseContext(), "Un checked", Toast.LENGTH_LONG).show();
            }
        });
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