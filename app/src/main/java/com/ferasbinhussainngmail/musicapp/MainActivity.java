package com.ferasbinhussainngmail.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.ferasbinhussainngmail.musicapp.R.id.sia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView enrique = (TextView) findViewById(R.id.enrique);
        enrique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, EnriqueActivity.class);
                startActivity(numbersIntent);
            }
        });
        TextView talal = (TextView) findViewById(R.id.talal);
        talal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent talalIntent = new Intent(MainActivity.this, TalalActivity.class);
                startActivity(talalIntent);
            }
        });
        TextView sia = (TextView) findViewById(R.id.sia);
        sia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siaIntent = new Intent(MainActivity.this, SiaActivity.class);
                startActivity(siaIntent);
            }
        });
        TextView adele = (TextView) findViewById(R.id.adele);
        adele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adeleIntent = new Intent(MainActivity.this, AdeleActivity.class);
                startActivity(adeleIntent);
            }
        });
    }
}
