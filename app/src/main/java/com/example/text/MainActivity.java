package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // убирает actionbar
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // делает ориентацию горизонтальной

        //button = (Button) findViewById(R.id.strt);
        //button.setOnClickListener((view ->{
        //    Intent i = new Intent(getApplicationContext(), History.class);
       //    startActivity(i);
        //}));

    }
}