package com.example.per2.apexlegendsguide;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

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


public class IndividualGunActivity extends AppCompatActivity {

    public static final String HEHE = "0";

    private TextView gunName;
    private TextView gunType;
    private TextView gunTypeDesc;
    private TextView ammo;
    private TextView ammoDesc;
    private TextView ammoType;
    private TextView ammoTypeDesc;
    private TextView stock;
    private TextView stockDesc;
    private ImageView gunPic;

    private Gun gun;
    private Guns guns;

    private Gun[] gunArray;

    private String value;
    private int valuee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_gun);
        wirewidgets();

        Gson gson = new Gson();
        InputStream gunFileInputStream = getResources().openRawResource(R.raw.guns);
        String gunString = readTextFile(gunFileInputStream);
        guns = gson.fromJson(gunString, Guns.class);
        gunArray = guns.getGuns();

        Intent intent = getIntent();
        value = intent.getStringExtra("value");
        valuee = Integer.parseInt(value);

        for (int i = 0; i == gunArray.length - 1; i++)
        {
            if (i == valuee) {
                gun = gunArray[i];
            }
        }
        Log.d(HEHE, gun.getName());
        setGunPage();
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

    private void setGunPage() {
        gunName.setText(gun.getName());
        gunTypeDesc.setText(gun.getGunType());
        ammo.setText(gun.getAmmo());
        ammoType.setText(gun.getAmmotype());
        stock.setText(gun.getStock());

        String name = gun.getImgurl();
        int id = getResources().getIdentifier(name, "drawable", getPackageName());
        Drawable drawable = getResources().getDrawable(id);
        gunPic.setImageDrawable(drawable);
    }

    private void wirewidgets() {
        gunName = findViewById(R.id.textView_indGun_name);
        gunType = findViewById(R.id.textView_indGun_gunType);
        gunTypeDesc = findViewById(R.id.textView_indGun_gunTypeDesc);
        ammo = findViewById(R.id.textView_indGun_ammo);
        ammoDesc = findViewById(R.id.textView_indGun_ammoDesc);
        ammoType = findViewById(R.id.textView_indGun_ammoType);
        ammoTypeDesc = findViewById(R.id.textView_indGun_ammoTypeDesc);
        stock = findViewById(R.id.textView_indGun_stock);
        stockDesc = findViewById(R.id.textView_indGun_stockDesc);
        gunPic = findViewById(R.id.imageView_indGun_gunImage);
    }
}








