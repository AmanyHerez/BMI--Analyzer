package com.example.bmi_analyzer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login_screen extends AppCompatActivity {
    EditText username,password;
    Button Login,Sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_secreen);
        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login_screen.this,home.class);
                startActivity(i);
            }
        });
        Sign_up=(Button)findViewById(R.id.sign_up);
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login_screen.this,register_screen.class);
                startActivity(i);
            }
        });
        Login=(Button)findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(login_screen.this,home.class);
                startActivity(i);
            }
        });
    }

}
