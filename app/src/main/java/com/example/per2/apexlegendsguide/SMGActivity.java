package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SMGActivity extends AppCompatActivity {

    private ListView smgListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smg);
        wirewidgets();
        List<String> smg = new ArrayList<>();
        smg.add("R-99");
        smg.add("Prowler Burst PDW");
        smg.add("Alternator SMG");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, smg);
        smgListView.setAdapter(arrayAdapter);
    }

    private void wirewidgets() {
        smgListView = findViewById(R.id.SMG_ListView);
    }
}


