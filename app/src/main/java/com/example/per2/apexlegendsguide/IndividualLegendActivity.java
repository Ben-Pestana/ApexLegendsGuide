package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class IndividualLegendActivity extends AppCompatActivity {

    private String value;

    private Legend[] legendArray;

    private static String TAG = "tag";

    private ImageView legendImage;
    private Button name;
    private TextView personalfacts;
    private Button tact;
    private Button pass;
    private Button ult;
    private TextView ultDesc;
    private TextView passDesc;
    private TextView tactDesc;
    private Button cooldownTact;
    private Button cooldownPass;
    private Button cooldownUlt;

    private Legend legend;

    private Legends legends;

    private Tact tactical;
    private Pass passive;
    private Ult ultimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_legend);
        wirewidgets();

        Gson gson = new Gson();
        InputStream legendFileInputStream = getResources().openRawResource(R.raw.legends);
        String legendsString = readTextFile(legendFileInputStream);
        legends = gson.fromJson(legendsString, Legends.class);
        legendArray = legends.getLegends();

        Intent intent = getIntent();
        value = intent.getStringExtra("value");

        if (value.equals("0")) {
            legend = legendArray[0];
        }
        else if (value.equals("1")) {
            legend = legendArray[1];
        }
        else if (value.equals("2")) {
            legend = legendArray[2];
        }
        else if (value.equals("3")) {
            legend = legendArray[3];
        }
        else if (value.equals("4")) {
            legend = legendArray[4];
        }
        else if (value.equals("5")) {
            legend = legendArray[5];
        }
        else if (value.equals("6")) {
            legend = legendArray[6];
        }
        else if (value.equals("7")) {
            legend = legendArray[7];
        }
        else if (value.equals("8")) {
            legend = legendArray[8];
        }

        setLegendPage();

    }

    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }

    private void setLegendPage() {
        Log.d(TAG, legend.getName());
        name.setText(legend.getName());

        if (value.equals("0")) {
            legendImage.setImageResource(R.drawable.caustic_legend);
        }
        else if (value.equals("1")) {
            legendImage.setImageResource(R.drawable.mirage_legend);
        }
        else if (value.equals("2")) {
            legendImage.setImageResource(R.drawable.pathfinder_legend);
        }
        else if (value.equals("3")) {
            legendImage.setImageResource(R.drawable.wraith_legend);
        }
        else if (value.equals("4")) {
            legendImage.setImageResource(R.drawable.octane_legend);
        }
        else if (value.equals("5")) {
            legendImage.setImageResource(R.drawable.bloodhound_legend);
        }
        else if (value.equals("6")) {
            legendImage.setImageResource(R.drawable.bangalore_legend);
        }
        else if (value.equals("7")) {
            legendImage.setImageResource(R.drawable.lifeline_legend);
        }
        else if (value.equals("8")) {
            legendImage.setImageResource(R.drawable.gibraltar_legend);
        }

        Log.d(TAG, "realname:" + legend.getRealName() + "\r\nage:" + legend.getAge() + "\r\ngender:" + legend.getGender());
        personalfacts.setText("Real Name: " + legend.getRealName() + "\r\n\nAge: " + legend.getAge() + "\r\n\nGender: " + legend.getGender());

        tact.setText(legend.getTact().getName());
        tactDesc.setText(legend.getTact().getDesc());
        cooldownTact.setText(legend.getTact().getDuration());

        pass.setText(legend.getPass().getName());
        passDesc.setText(legend.getPass().getDesc());
        cooldownPass.setText(legend.getPass().getDuration());

        ult.setText(legend.getUlt().getName());
        ultDesc.setText(legend.getUlt().getDesc());
        cooldownUlt.setText(legend.getUlt().getCharge());
    }

    private void wirewidgets() {
        name = findViewById(R.id.button_indLegend_name);
        legendImage = findViewById(R.id.imageView_legendImage_individuallegend);
        personalfacts = findViewById(R.id.textView_indLegend_desc);

        tact = findViewById(R.id.button_indLegend_tact);
        pass = findViewById(R.id.button_indLegend_pass);
        ult = findViewById(R.id.button_indLegend_ult);

        ultDesc = findViewById(R.id.textView_indLegend_ultDesc);
        passDesc = findViewById(R.id.textView_indLegend_passDesc);
        tactDesc = findViewById(R.id.textView_indLegend_tactDesc);

        cooldownPass = findViewById(R.id.button_indLegend_cooldownPass);
        cooldownTact = findViewById(R.id.button_indLegend_cooldownTact);
        cooldownUlt = findViewById(R.id.button_indLegend_cooldownUlt);
    }
}


