package com.example.dumisile.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Johannesburg extends AppCompatActivity implements View.OnClickListener {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_johannesburg);

        button = (Button) findViewById(R.id.Btnmoment);


        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intentA=new Intent(Johannesburg.this, MainGuide.class);
        startActivity(intentA);



    }
}
