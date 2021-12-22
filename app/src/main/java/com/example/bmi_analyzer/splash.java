package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splash extends AppCompatActivity {
    Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Next=(Button)findViewById(R.id.next);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(splash.this,login_screen.class);
                startActivity(i);
            }
        });

    }
}