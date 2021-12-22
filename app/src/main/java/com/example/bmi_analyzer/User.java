package com.example.bmi_analyzer;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class User {

    public static User user;
    private FirebaseAuth mAuth;

    private String name, email, password,bd;
    private boolean male;
    public User(String name, String email, String password, String re_password, AppCompatActivity context) throws  Exception{
    /*    if(!name.matches("[A-Za-z\\s]+"))throw new UserInfoException("name");
        if(!email.matches("[A-Za-z][\\w]{0,31}@[\\w]{2,10}\\.com"))throw new UserInfoException("email");
        if(!password.equals(re_password))throw new UserInfoException("re-password");
        if(password.length()<3)throw new UserInfoException("re-password");
      */  this.name=name;
        this.email=email;
        this.password=password;
        //firebase.registration(this,context);

    }

    public FirebaseAuth getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }
    public User(String email, String password){
        this.email=email;
        this.password=password;
    }
    public boolean isMale(){ return male;}
}
