package com.icandothisallday2020.ex50flootingactionbutton_snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickFAB(View view) {
        //Toast UP Grade Version. !!!<<<Snack Bar>>>!!!
        //(add action button)
        Snackbar.make(view,"This is Snackbar",Snackbar.LENGTH_INDEFINITE)
                //1:view:나타날 위치,text, duration(INDEFINITE:무한히)
                .setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "click OK", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }
    public void clickBtn(View view) {
        //새로운 CoordinatorLayout 을 이용->원하는 위치에 snack bar 를 설정
        View codi=findViewById(R.id.layout_snackbar_container);
        Snackbar.make(codi,"set position snack bar",Snackbar.LENGTH_LONG)
                .setAction("Submit", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Umm..", Toast.LENGTH_SHORT).show();
            }
        }).show();
    }
}
