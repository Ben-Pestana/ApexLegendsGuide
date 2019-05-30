package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView mainListView;
    private String[] tabs = {"Legend", "Guns", "Ammo", "Attachments", "Armor", "Drop Locations"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();

        // load the json file and make a list of legends from it
        // log the data in the list

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_main, tabs);
        mainListView.setAdapter(arrayAdapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0){
                    Intent startLegend = new Intent(MainActivity.this, LegendActivity.class);
                    startActivity(startLegend);
                }
                else if (position == 1) {
                    Intent startGun = new Intent(MainActivity.this, MainGunActivity.class);
                    startActivity(startGun);
                }
                if (position == 2) {
                    Intent startAmmo = new Intent(MainActivity.this, AmmoActivity.class);
                    startActivity(startAmmo);
                }
            }
        });
    }

    private void wireWidgets() {
        mainListView = findViewById(R.id.listView_main_mainListView);

    }
}
