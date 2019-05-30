
package com.example.per2.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.per2.apexlegendsguide.R;

import java.util.ArrayList;
import java.util.List;

public class ARActivity extends AppCompatActivity {

    private ListView aRListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);
        wirewidgets();
        List<String> aR = new ArrayList<>();
        aR.add("Hemlok Burst AR");
        aR.add("R-301 Carbine");
        aR.add("VK-47 Flatline");
        aR.add("HAVOC");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, aR);
        aRListView.setAdapter(arrayAdapter);
    }

    private void wirewidgets() {
        aRListView = findViewById(R.id.AR_ListView);
    }
}