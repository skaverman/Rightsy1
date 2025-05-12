package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Brain_Teasure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        // Back button functionality
        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Brain_Teasure.this, HomeActivity.class));
            }
        });

        // Detective Brain Card
        CardView detective_brain = findViewById(R.id.detective);
        detective_brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, DetectiveWeb.class);
                it.putExtra("title", "Family Physician");
                startActivity(it);
            }
        });

        // Zumble Words Card
        LinearLayout zumbleLinearLayout = findViewById(R.id.Zumble);  // No need to use LinearLayout here
        zumbleLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, ZumbleWordsActivity2.class);
                it.putExtra("title", "Zumble Words");
                startActivity(it);
            }
        });

        // Sudoku Card
        CardView suduko = findViewById(R.id.Suduko);
        suduko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, SudkhoActivity.class);
                it.putExtra("title", "Sudoku");
                startActivity(it);
            }
        });

        // Make Team Card
        CardView make_team = findViewById(R.id.Team);
        make_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Brain_Teasure.this, Make_Team.class);
                it.putExtra("title", "Surgeon");
                startActivity(it);
            }
        });

        // Special Card
        CardView missing_number = findViewById(R.id.Special);
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
