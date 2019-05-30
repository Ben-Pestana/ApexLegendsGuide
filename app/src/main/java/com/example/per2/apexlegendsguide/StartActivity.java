package com.example.per2.apexlegendsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        wireWidgets();

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enterToMain = new Intent(StartActivity.this, MainActivity.class);
                startActivity(enterToMain);
            }
        });
    }

    private void wireWidgets() {
        enter = findViewById(R.id.button_start_enter);
    }

}
