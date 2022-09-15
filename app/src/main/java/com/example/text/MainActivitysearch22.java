package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivitysearch22 extends AppCompatActivity {
    private ImageButton button2,button3,button4,button5 ,button6,button7,button8,button9,button10,button11,button12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysearch22);
        button2 = findViewById(R.id.imageButtonsearch);
        button3 = findViewById(R.id.imageButtonsearch1);
        button4 = findViewById(R.id.imageButtonsearch2);
        button5 = findViewById(R.id.imageButtonsearch3);
        button6 = findViewById(R.id.imageButtonsearch4);
        button7 = findViewById(R.id.imageButtonsearch5);
        button8 = findViewById(R.id.imageButtonsearch6);
        button9 = findViewById(R.id.imageButtonsearch7);
        button10 = findViewById(R.id.imageButtonsearch8);
        button11 = findViewById(R.id.imageButtonsearch9);
        button12 = findViewById(R.id.imageButtonsearch10);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivitysearch22.this,MainActivitysearch222.class);
                startActivity(intent);
            }
        });
    }
}