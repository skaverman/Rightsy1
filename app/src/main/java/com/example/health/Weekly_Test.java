package com.example.health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.QuestionsBank;
import com.QuestionsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Weekly_Test extends AppCompatActivity {
    private TextView questions;
    private TextView question;
    private String SelectedOptionByUser=" ";
    private int currentQuestionPosition=0;
    private AppCompatButton Option1, Option2, Option3, Option4;
    private AppCompatButton next;
    private Timer quizTimer;
    private int seconds = 0;
    private int totalTimeInMins = 300;
    private  List<QuestionsList> questionsLists ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_test);


        final ImageView backBtn = findViewById(R.id.backBtn);
        // final TextView timerTextView=findViewById(R.id.timer);

        final TextView selectedTopicName = findViewById(R.id.TopicName);
      //  questions = findViewById(R.id.questions);
        question = findViewById(R.id.question);
        Option4 = findViewById(R.id.Option1);
        Option3= findViewById(R.id.Option2);
        Option2 = findViewById(R.id.Option3);
        Option1 = findViewById(R.id.Option4);
        next = findViewById(R.id.next);


        final String getSelectedTopicname = getIntent().getStringExtra("selectedTopic");
        selectedTopicName.setText(getSelectedTopicname);


        //Question ane ke liye
        questionsLists= QuestionsBank.getQuestions(getSelectedTopicname);

        questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        Option1.setText(questionsLists.get(0).getOption1());
        Option2.setText(questionsLists.get(0).getOption2());
        Option3.setText(questionsLists.get(0).getOption3());
        Option4.setText(questionsLists.get(0).getOption4());


        Option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SelectedOptionByUser.isEmpty()){
                    SelectedOptionByUser=Option1.getText().toString();
                    Option1.setBackgroundResource(R.drawable.round_back_red10);
                    Option1.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(SelectedOptionByUser);
                }

            }
        });

        Option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(SelectedOptionByUser.isEmpty()){
                    SelectedOptionByUser=Option1.getText().toString();
                    Option1.setBackgroundResource(R.drawable.round_back_red10);
                    Option1.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(SelectedOptionByUser);
                }

            }
        });

        Option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SelectedOptionByUser.isEmpty()){
                    SelectedOptionByUser=Option1.getText().toString();
                    Option1.setBackgroundResource(R.drawable.round_back_red10);
                    Option1.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(SelectedOptionByUser);
                }

            }
        });

        Option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SelectedOptionByUser.isEmpty()){
                    SelectedOptionByUser=Option1.getText().toString();
                    Option1.setBackgroundResource(R.drawable.round_back_red10);
                    Option1.setTextColor(Color.WHITE);

                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(SelectedOptionByUser);
                }

            }
        });

        //next question ke liye
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (SelectedOptionByUser.isEmpty()){
                    Toast.makeText(Weekly_Test.this, "Please select an Option", Toast.LENGTH_SHORT).show();
                }else{
                    changeNextQuestion();
                }

            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    /// for switching next Question
    private void changeNextQuestion(){
        currentQuestionPosition++;
        if((currentQuestionPosition+1)==questionsLists.size()){
            next.setText("Submit Quiz");

        }
        if(currentQuestionPosition<questionsLists.size()){
            SelectedOptionByUser="";
            Option1.setBackgroundResource(R.drawable.round_back_white_stroke10);
            Option1.setTextColor(Color.parseColor("#1F6BB8"));

            Option2.setBackgroundResource(R.drawable.round_back_white_stroke10);
            Option2.setTextColor(Color.parseColor("#1F6BB8"));

            Option3.setBackgroundResource(R.drawable.round_back_white_stroke10);
            Option3.setTextColor(Color.parseColor("#1F6BB8"));

            Option4.setBackgroundResource(R.drawable.round_back_white_stroke10);
            Option4.setTextColor(Color.parseColor("#1F6BB8"));


            questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            Option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            Option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            Option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            Option4.setText(questionsLists.get(currentQuestionPosition).getOption4());




        }else{
            Intent intent=new Intent(Weekly_Test.this,QuizResultActivity.class);
          //  intent.putExtra("correct",getCorrectAnswers());
          //  intent.putExtra("incorrect",getInCorrectAnswers());
            finish();

        }
    }





    //code line 231 ke liye hai after timer

    private void revealAnswer(){
        final String getAnswer=questionsLists.get(currentQuestionPosition).getAnswer();
        if(Option1.getText().toString().equals(getAnswer)){
            Option1.setBackgroundResource(R.drawable.round_back_green10);
            Option1.setTextColor(Color.WHITE);

        } else if (Option1.getText().toString().equals(getAnswer)) {
            Option2.setBackgroundResource(R.drawable.round_back_green10);
            Option2.setTextColor(Color.WHITE);


        } else if (Option1.getText().toString().equals(getAnswer)) {
            Option3.setBackgroundResource(R.drawable.round_back_green10);
            Option3.setTextColor(Color.WHITE);

        } else if (Option1.getText().toString().equals(getAnswer)) {
            Option4.setBackgroundResource(R.drawable.round_back_green10);
            Option4.setTextColor(Color.WHITE);


        }

    }
}
      //  startTimer(Timer);

       /* private void startTimer(TextView timerTextView);
        quizTimer=new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int totalTimeInMins;
                if (seconds == 0) {
                    totalTimeInMins--;

                } else if (seconds == 0 && totalTimeInMins == 0) {
                    quizTimer.purge();
                    quizTimer.cancel();
                    Toast.makeText(Weekly_Test.this, "Time Up", Toast.LENGTH_SHORT).show();

                }

            }
        });*/



          /* private void StartTimer( final TextView timerTextView){
            quizTimer = new Timer();
            quizTimer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            // boolean b = totalTimeInMins == 0;
                            if (seconds == 0 && totalTimeInMins > 0) {
                                totalTimeInMins--;
                                seconds = 59; // Reset seconds to 59 when a minute is deducted

                            } else if (seconds == 0 && totalTimeInMins == 0) {
                                quizTimer.purge();
                                quizTimer.cancel();
                                Toast.makeText(Weekly_Test.this, "Time Up", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Weekly_Test.this, QuizResultActivity.class);
                                intent.putExtra("correct", getCorrectAnswers());
                                intent.putExtra("incorrect", getCorrectAnswers());
                                startActivity(intent);
                                finish();


                            } else {
                                seconds--;

                            }
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    String finalMinutes = String.valueOf(totalTimeInMins);
                                    String finalSeconds = String.valueOf(seconds);
                                    if (finalMinutes.length() == 1) {
                                        finalMinutes = "0" + finalMinutes;

                                    }
                                    if (finalSeconds.length() == 1) {
                                        finalSeconds = "0" + finalSeconds;
                                    }
                                    timerTextView.setText(finalMinutes + ":" + finalSeconds);


                                }

                            });
                        }


                    }, 0, 1000); // Schedule the task to run every 1000 milliseconds (1 second)

                }

                private int getCorrectAnswers() {
                    int correctAnswers = 0;
                    for (int i = 0; i < questionsLists.size(); i++) {
                        final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
                        final String getAnswer = questionsLists.get(i).getAnswer();
                        if (getUserSelectedAnswer.equals(getAnswer)) {
                            correctAnswers++;
                        }

                    }

                    return correctAnswers;

                }

                private int getInCorrectAnswers() {
                    int correctAnswers = 0;
                    for (int i = 0; i < questionsLists.size(); i++) {
                        final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
                        final String getAnswer = questionsLists.get(i).getAnswer();
                        if (getUserSelectedAnswer.equals(getAnswer)) {
                            correctAnswers++;
                        }

                    }

                    return correctAnswers;
                }



            }*/