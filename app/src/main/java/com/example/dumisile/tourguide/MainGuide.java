package com.example.dumisile.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainGuide extends AppCompatActivity {

    DetailsRecyclerView adapter;
    RecyclerView recyclerView;
    Details details;
    Details mall;
    Details bar;
    Details spa;
    Details park;
    Details zoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_guide);
        recyclerView=(RecyclerView)findViewById(R.id.Recyclerview);
        //
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Details>detailsArrayList=new ArrayList<>();

        details = new Details();
        details.setDescription("OUR TOP RESTAURANTS");
        details.setIcon(R.drawable.restauraaant);

        mall=new Details();
        mall.setDescription("THE MOST VISITED MALLS");
        mall.setIcon(R.drawable.malls);

        bar=new Details();
        bar.setDescription("NIGHTLIFE IN OUR JOHANNESBURG CLUBS");
        bar.setIcon(R.drawable.nightclubs);

        spa=new Details();
        spa.setDescription("MANTAINING YOUR INNER AND OUTER BEAUTY IN OUR SPAS");
        spa.setIcon(R.drawable.spaz);

        park=new Details();
        park.setDescription("EVOKE YOUR FREE SPIRIT IN OUR THEME PARK");
        park.setIcon(R.drawable.themelogo);

        zoo=new Details();
        zoo.setDescription("NATURE CALLS YOU TO OUR BIGGEST ZOO IN THE PROVINCE");
        zoo.setIcon(R.drawable.zooooo);




        detailsArrayList.add(details);
        detailsArrayList.add(mall);
        detailsArrayList.add(bar);
        detailsArrayList.add(spa);
        detailsArrayList.add(park);
        detailsArrayList.add(zoo);


        adapter=new DetailsRecyclerView(this,detailsArrayList);
        recyclerView.setAdapter(adapter);



    }


}
