package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dsQG = new ArrayList<Country>();
        Country qg1 = new Country("VietNam","vn", 800);
        Country qg2 = new Country("America","us", 80);
        Country qg3 = new Country("Russia","ru", 80);
        dsQG.add(qg1);
        dsQG.add(qg2);
        dsQG.add(qg3);
        ListView lvQG = findViewById(R.id.ListViewNation);
        CountryArrayAdapter adapter;
        adapter = new CountryArrayAdapter(dsQG, this);
        lvQG.setAdapter(adapter);
    }
}