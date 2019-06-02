package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ImageButton legends;
    private ImageButton guns;
    private ImageButton ammo;

    private ImageView map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();

        legends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startLegendPage = new Intent(MainActivity.this, LegendActivity.class);
                startActivity(startLegendPage);
            }
        });
        guns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startGunPage = new Intent(MainActivity.this, MainGunActivity.class);
                startActivity(startGunPage);
            }
        });
        ammo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAmmoPage = new Intent(MainActivity.this, AmmoActivity.class);
                startActivity(startAmmoPage);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "map pressed", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void wireWidgets() {
        legends = findViewById(R.id.imageButton_main_legendbutton);
        guns = findViewById(R.id.imageButton_main_gunButton);
        ammo = findViewById(R.id.imageButton_main_ammoButton);
        map = findViewById(R.id.imageView_main_map);
    }
}
