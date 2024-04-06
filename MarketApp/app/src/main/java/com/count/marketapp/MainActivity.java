package com.count.marketapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMarketList;
    ArrayList<Item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        rvMarketList = findViewById(R.id.rvMarketList);
        items = new ArrayList<>();
        items.add(new Item("mercury",  "moons of mercury",R.drawable.mercury));
        items.add(new Item("neptune",  "moons of neptune",R.drawable.neptune));
        items.add(new Item("pluto",  "moons of pluto",R.drawable.pluto));
        items.add(new Item("saturn",  "moons of saturn",R.drawable.saturn));
        items.add(new Item("sun",  "moons of sun",R.drawable.sun));
        items.add(new Item("uranus",  "moons of uranus",R.drawable.uranus));
        items.add(new Item("venus",  "moons of venus",R.drawable.venus));
        items.add(new Item("uranus",  "moons of uranus",R.drawable.uranus));
        items.add(new Item("asteroid",  "moons of asteroid",R.drawable.asteroid));

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(items,R.layout.activity_main);

        rvMarketList = (RecyclerView) findViewById(R.id.rvMarketList);
        rvMarketList.setLayoutManager(new LinearLayoutManager(this));
        rvMarketList.setAdapter(itemArrayAdapter);
    }
}