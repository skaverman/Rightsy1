package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final AppCompatButton
                startNewBtn=findViewById(R.id.StartQuiz);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final TextView correctAnswer=findViewById(R.id.correctAnswers);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        final TextView incorrectAnswers=findViewById(R.id.incorrectAnswer);
        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswers.setText(String.valueOf(getIncorrectAnswers));
        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizResultActivity.this,Weekly_Test.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(QuizResultActivity.this, Weekly_Test.class));
        finish();
    }
}