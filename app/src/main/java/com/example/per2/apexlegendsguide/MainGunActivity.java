package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainGunActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gun);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                if (groupPosition == 0 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "8");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 0 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "9");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 1 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "4");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 1 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "5");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 1 && childPosition == 2) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "6");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 1 && childPosition == 3) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "7");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 2 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "0");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 2 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "1");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 2 && childPosition == 2) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "2");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 2 && childPosition == 3) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "3");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 3 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "17");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 3 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "18");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 3 && childPosition == 2) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "19");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 4 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "13");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 4 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "14");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 4 && childPosition == 2) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "15");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 4 && childPosition == 3) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "16");
                    startActivity(startGunInd);
                }
                if (groupPosition == 5 && childPosition == 0) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "17");
                    startActivity(startGunInd);
                }
                else if (groupPosition == 5 && childPosition == 1) {
                    Intent startGunInd = new Intent(MainGunActivity.this, IndividualGunActivity.class);
                    startGunInd.putExtra("value", "18");
                    startActivity(startGunInd);
                }
                return false;
            }
        });
    }

}

