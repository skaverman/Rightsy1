package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

        CardView exit = findViewById(R.id.cardExist);
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
        CardView Brain_Teasure = findViewById(R.id.cardFindDoctor);
        Brain_Teasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivities(new Intent[]{new Intent(HomeActivity.this, FindDoctorActivity.class)});
                startActivity(new Intent(HomeActivity.this, Brain_Teasure.class));
            }
        });
        CardView SRT = findViewById(R.id.cardLabTest);
        SRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, SRT_Quizes.class);
                startActivity(it);
            }
        });
        CardView car_Race = findViewById(R.id.cardOrderDetails);
        car_Race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,Car_Web.class));
            }
        });
        CardView weekly_Quiz = findViewById(R.id.cardBuyMedicine);
        weekly_Quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,QuizActivity.class));
            }
        });
    }
}