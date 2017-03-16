package com.ferasbinhussainngmail.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TalalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talal);
        TextView media = (TextView) findViewById(R.id.mediaT);
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(TalalActivity.this, TalalMedia.class);
                startActivity(playIntent);
                Toast.makeText(getApplicationContext(), "You have to press done whene you finish",Toast.LENGTH_LONG).show();
            }
        });
    }
}
