package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username", " ").toString();
        Toast.makeText(getApplicationContext(), "Welcome " +username, Toast.LENGTH_SHORT).show();

        CardView exit = findViewById(R.id.log_out);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                //startActivities(new Intent[]{new Intent(HomeActivity.this, LoginActivity.class)});
                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
            }
        });
        CardView Brain_Teasure = findViewById(R.id.brain_teasure);
        Brain_Teasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivities(new Intent[]{new Intent(HomeActivity.this, FindDoctorActivity.class)});
                startActivity(new Intent(HomeActivity.this, Brain_Teasure.class));
            }
        });
        //CardView SRT = findViewById(R.id.srt);

        CardView car_Race = findViewById(R.id.car_race);
        car_Race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,Car_Web.class));
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        CardView weekly_Quiz = findViewById(R.id.weekly_quiz);
        weekly_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,QuizActivity.class));
            }
        });
    }
}