package com.ferasbinhussainngmail.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EnriqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrique);
        TextView play = (TextView) findViewById(R.id.mediaE);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(EnriqueActivity.this, EnriqueMedia.class);
                startActivity(playIntent);
                Toast.makeText(getApplicationContext(), "You have to press done whene you finish",Toast.LENGTH_LONG).show();
            }
        });
    }
}
