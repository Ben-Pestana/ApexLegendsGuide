package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShotgunActivity extends AppCompatActivity {

    private ListView shotgunListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotgun);
        wirewidgets();
        List<String> shotgun = new ArrayList<>();
        shotgun.add("Mastiff Shotgun");
        shotgun.add("EVA-8 Auto");
        shotgun.add("Peacekeeper");
        shotgun.add("Mozambique Shotgun");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shotgun);
        shotgunListView.setAdapter(arrayAdapter);

    }

    private void wirewidgets() {
        shotgunListView = findViewById(R.id.Shotgun_ListView);
    }
}



