package com.example.dumisile.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button discover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discover = (Button) findViewById(R.id.btndiscover);
        discover.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent(MainActivity.this, Johannesburg.class);
        startActivity(intent);



    }
}
