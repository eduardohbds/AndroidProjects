package com.count.planetapp;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlanetList;
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
        rvPlanetList = findViewById(R.id.rvPlanetList);
        items = new ArrayList<>();
        items.add(new Item("mercury", R.drawable.mercury, 1));
        items.add(new Item("neptune", R.drawable.neptune, 1));
        items.add(new Item("pluto", R.drawable.pluto, 1));
        items.add(new Item("saturn", R.drawable.saturn, 1));
        items.add(new Item("sun", R.drawable.sun, 1));
        items.add(new Item("uranus", R.drawable.uranus, 1));// Replace with your data
        items.add(new Item("venus", R.drawable.venus, 1));// Replace with your data
        items.add(new Item("uranus", R.drawable.uranus, 1));// Replace with your data
        items.add(new Item("asteroid", R.drawable.asteroid, 1));  // Replace with your data
        Log.d("Main","items = new ArrayList<>();");

        ItemArrayAdapter itemArrayAdapter = new ItemArrayAdapter(items,R.layout.activity_item_list);

        rvPlanetList = (RecyclerView) findViewById(R.id.rvPlanetList);
        rvPlanetList.setLayoutManager(new LinearLayoutManager(this));
        rvPlanetList.requestLayout();
        rvPlanetList.setAdapter(itemArrayAdapter);
    }
}