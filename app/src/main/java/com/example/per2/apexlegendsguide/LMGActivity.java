package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LMGActivity extends AppCompatActivity {

    private ListView lmgListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmg);
        wirewidgets();
        List<String> lMG = new ArrayList<>();
        lMG.add("M600 Spitfire");
        lMG.add("Devotion");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lMG);
        lmgListView.setAdapter(arrayAdapter);
    }

    private void wirewidgets() {
        lmgListView = findViewById(R.id.LMG_ListView);
    }
}

