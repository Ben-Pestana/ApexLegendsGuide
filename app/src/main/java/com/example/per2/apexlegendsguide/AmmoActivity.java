package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AmmoActivity extends AppCompatActivity {

    private ListView ammoListView;
    private String[] tabs = {"Light Rounds","Heavy Rounds","Energy Ammo","Shotgun Shells"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ammo);

        wireWidgets();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_main, tabs);
        ammoListView.setAdapter(arrayAdapter);
    }

    private void wireWidgets() {
        ammoListView = findViewById(R.id.listView_ammo_ammoList);
    }
}
