package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LegendActivity extends AppCompatActivity {

    private ListView championsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legend);
        List<String> champions = new ArrayList<String>();
        champions.add("Caustic");
        champions.add("Mirage");
        champions.add("Pathfinder");
        champions.add("Wraith");
        champions.add("Octane");
        champions.add("Bloodhound");
        champions.add("Bangalore");
        champions.add("Lifeline");
        champions.add("Gibraltar");
        wirewidgets();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item_main, champions);
        championsListView.setAdapter(arrayAdapter);

        championsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0){
                    Intent startLegendInd = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd.putExtra("value", "0");
                    startActivity(startLegendInd );
                }
                else if (position == 1) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "1");
                    startActivity(startLegendInd );
                }
                else if (position == 2) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "2");
                    startActivity(startLegendInd );
                }
                else if (position == 3) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "3");
                    startActivity(startLegendInd );
                }
                else if (position == 4) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "4");
                    startActivity(startLegendInd );
                }
                else if (position == 5) {
                    Intent startLifeline = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLifeline.putExtra("value", "5");
                    startActivity(startLifeline);
                }
                else if (position == 6) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "6");
                    startActivity(startLegendInd );
                }
                else if (position == 7) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "7");
                    startActivity(startLegendInd );
                }
                else if (position == 8) {
                    Intent startLegendInd  = new Intent(LegendActivity.this, IndividualLegendActivity.class);
                    startLegendInd .putExtra("value", "8");
                    startActivity(startLegendInd);
                }
            }
        });
    }

    private void wirewidgets() {
        championsListView = findViewById(R.id.ListView_legendActivity);
    }
}
