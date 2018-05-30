package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexvasilkov.foldablelayout.sample.R;

public class Sebab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebab);

        Button button9;

        button9 = (Button) findViewById(R.id.button9);


        button9.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Sebab.this, Asas.class);
                startActivity(intent);
            }
        });

    }
}
