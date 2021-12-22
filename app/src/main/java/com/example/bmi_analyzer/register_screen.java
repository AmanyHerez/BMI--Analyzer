package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_screen extends AppCompatActivity {
    Button Create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        Create=(Button)findViewById(R.id.next);
        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(register_screen.this,Complete_Information.class);
                startActivity(i);
            }
        });
    }
}