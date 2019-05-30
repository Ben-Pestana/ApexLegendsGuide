package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SniperActivity extends AppCompatActivity {

    private ListView sniperListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sniper);
        wirewidgets();
        List<String> sniper = new ArrayList<>();
        sniper.add("Kraber.50 cal Sniper");
        sniper.add("Longbow DMR");
        sniper.add("G7 Scout");
        sniper.add("Triple Take");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sniper);
        sniperListView.setAdapter(arrayAdapter);
    }

    private void wirewidgets() {
        sniperListView = findViewById(R.id.Sniper_ListView);
    }
}


