package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class my extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    public void on_my_back(View v)
    {
        finish();
    }

    public void on_my_search(View v)
    {
        Intent isearch = new Intent(this, search.class);
        startActivity(isearch);
    }

    public void on_my_memo(View v)
    {
        Intent imemo = new Intent(this, memo.class);
        startActivity(imemo);
    }

    public void on_my_cal(View v)
    {
    Intent ical = new Intent(this, cal.class);
    startActivity(ical);
    }

    public void on_my_qu(View v)
    {
    Intent iqu = new Intent(this, qu.class);
    startActivity(iqu);
    }

    public void on_my_cho(View v)
    {
        Intent icho = new Intent(this, cho.class);
        startActivity(icho);
    }
}
