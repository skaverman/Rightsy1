package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Brain_Teasure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivities(new Intent[]{new Intent(FindDoctorActivity.this, HomeActivity.class)});
                startActivity(new Intent(Brain_Teasure.this,HomeActivity.class));
            }
        });

        CardView detective_brain = findViewById(R.id.cardFDFamilyPhysician);
        detective_brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, DetectiveWeb.class);
                it.putExtra("title", "Family Physician");
                startActivity(it);
            }
        });
        CardView zumble_words = findViewById(R.id.cardFDDietician);
        zumble_words.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, ZumbleWordsActivity2.class);
                it.putExtra("title", "zumble_words");
                startActivity(it);
            }
        });
        CardView suduko = findViewById(R.id.cardFDDentist);
        suduko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, SudkhoActivity.class);
                it.putExtra("title", "suduko");
                startActivity(it);
            }
        });
        CardView make_team = findViewById(R.id.cardFDSurgeon);
        make_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, Make_Team.class);
                it.putExtra("title", "Surgeon");
                startActivity(it);
            }
        });
        CardView missing_number= findViewById(R.id.cardFDCardiologists);
        missing_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, MissingActivity2.class);
                it.putExtra("title", "Cardiologist");
                startActivity(it);
            }
        });
    }
}