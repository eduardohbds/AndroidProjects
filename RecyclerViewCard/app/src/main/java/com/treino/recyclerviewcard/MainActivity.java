package com.treino.recyclerviewcard;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMain;
    private List<ItemCardModel> itensList;
    private ItemCardAdapter itensAdapter;
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
        // define os itens necessários para mostrar a lista
        rvMain = findViewById(R.id.rvMain);
        itensList = new ArrayList<>();

        // adiciona os itens na lista
        ItemCardModel itemCard1 = new ItemCardModel(
                "Terra",
                "Um bom planeta para morar com bastante agua, mas tem uma galera que não gosta de visita",
                R.drawable.earth);
        ItemCardModel itemCard2 = new ItemCardModel(
                "Terra",
                "Um bom planeta para morar com bastante agua, mas tem uma galera que não gosta de visita",
                R.drawable.earth);
        ItemCardModel itemCard3 = new ItemCardModel(
                "Terra",
                "Um bom planeta para morar com bastante agua, mas tem uma galera que não gosta de visita",
                R.drawable.earth);
        itensList.add(itemCard1);
        itensList.add(itemCard2);
        itensList.add(itemCard3);

        itensAdapter = new ItemCardAdapter(itensList);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setAdapter(itensAdapter);
    }
}