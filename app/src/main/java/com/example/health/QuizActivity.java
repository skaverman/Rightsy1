package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private String SelectedTopicName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final LinearLayout srt=findViewById(R.id.srt_Icon);
        final LinearLayout weekly_test=findViewById(R.id.WeeklyTest);

        final Button StartBtn=findViewById(R.id.StartQuiz);

        srt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectedTopicName="srt";
                srt.setBackgroundResource(R.drawable.round_back_white_stroke10);
//          weekly_test.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });
        weekly_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectedTopicName="weekly_test";
//                srt.setBackgroundResource(R.drawable.round_back_white_stroke10);
                weekly_test.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
        });
        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                if (SelectedTopicName.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Please select any one", Toast.LENGTH_SHORT).show();
                }else {
                    intent = new Intent(QuizActivity.this, Weekly_Test.class);
                    intent.putExtra("selectedTopic", SelectedTopicName);
                    startActivity(intent);
                }
            }
    });
    }
}