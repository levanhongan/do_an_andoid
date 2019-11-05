package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAccountManagement(View view) {
        Intent intent = new Intent(this,AccountManagement.class);

        this.startActivity(intent);
    }

    public void showViewGame(View view) {
        Intent intent = new Intent(this, ViewGame.class);

        this.startActivity(intent);
    }

    public void showPlayHistory(View view) {
        Intent intent = new Intent(this, AccountManagement.class);

        this.startActivity(intent);
    }

    public void showTopCharts(View view) {
        Intent intent = new Intent(this, UserAdapterTopCharts.class);

        this.startActivity(intent);
    }

    public void showBuyCredit(View view) {
        Intent intent = new Intent(this, BuyCredit.class);

        this.startActivity(intent);
    }
}
