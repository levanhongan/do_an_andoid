package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void showRegisterAccount(View view) {
        Intent intent = new Intent(this, RegisterAccount.class);

        this.startActivity(intent);
    }

    public void showForgotPassword(View view) {
        Intent intent = new Intent(this, ForgotPassword.class);

        this.startActivity(intent);
    }

    public void showMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        this.startActivity(intent);
    }
}
