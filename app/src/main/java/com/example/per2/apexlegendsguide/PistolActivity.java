package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PistolActivity extends AppCompatActivity {

    private ListView pistolListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistol);
        wirewidgets();
        List<String> pistol = new ArrayList<>();
        pistol.add("Wingman");
        pistol.add("RE-45 Auto");
        pistol.add("P2020");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pistol);
        pistolListView.setAdapter(arrayAdapter);
    }

    private void wirewidgets() {
        pistolListView = findViewById(R.id.Pistol_ListView);
    }
}


