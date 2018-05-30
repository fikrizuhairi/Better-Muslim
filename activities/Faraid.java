package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexvasilkov.foldablelayout.sample.R;

public class Faraid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faraid);

        Button buttonTentang;
        Button buttonCalc;

        buttonTentang = (Button) findViewById(R.id.button);
        buttonCalc = (Button) findViewById(R.id.button2);

        buttonTentang.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Faraid.this, Sebab.class);
                startActivity(intent);
            }
        });

        buttonCalc.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Faraid.this, PengiraanFaraid.class);
                startActivity(intent);
            }
        });
    }
}
