package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class SRT_Quizes extends AppCompatActivity {
    String[] Question_List ={"1.\tSituation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?","2.\tSituation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?",
    "3.\tSituation: A 14-year-old boy is found involved in a minor theft. What legal action can be taken under the applicable law?",
    "4.\tSituation: An 11-year-old child is being denied admission to a nearby school. What should the parents do?",
    "5.\tSituation: A 12-year-old girl is found with signs of malnutrition. What is the immediate course of action?",
    "6.\tSituation: A 15-year-old is found working in hazardous conditions. What law prohibits this, and what should be done?"
            ,"7.\tSituation: A 9-year-old child is being sexually harassed by a neighbor. What is the appropriate action?\n" +
            "\n","8.\tSituation: A 16-year-old is struggling with a disability and is not receiving adequate support. What action should be taken?",
            "9.\tSituation: A 16-year-old girl is being pressured into an early marriage by her family what should the girl do?",
            "10.\tA 12- year old is uncomfortable with the touch of a relative during the family gatherings. How should the child handle this situation?",};

    String[] Choose_List={"A.\tPraise the child for learning work skills"," B.\tIgnore the situation as it's part-time work","\n" +
            "            C.\tReport the incident to the Child Helpline or local police"," C.\tReport the incident to the Child Helpline or local police"," D.\tEncourage the child to continue working for extra income",



            " A.\tAllow the child to make an independent decision","  B.\tConvince the parents about the importance of education"," C.\tIgnore the pressure and let the child decide","  D.\tReport the incident to the school authorities\n",

            " A.\tTreat him as an adult and involve the police","       B.\tEnroll him in a rehabilitation program"," C.\tIgnore the situation as it's just a minor offense"," \n" +
            "            D.\tSuspend him from school",



            "A.\tAccept the situation and explore home schooling"," B.\tReport the incident to the school authorities or local education board","  C.\tIgnore the matter and look for other schools","D.\tEncourage the child to focus on extracurricular activities instead",

            "A.\tIgnore the situation as it might be temporary"," B.\tConsult a local healthcare professional","C.\tReport the incident to the school teacher","D.\tProvide the child with extra food at home\n",

            " A.\tRight to Education Act, 2009; Report to the labour union"," B.\tChild Labour (Prohibition and Regulation) Act, 1986; Continue working to support the family"," C.\tJuvenile Justice (Care and Protection of Children) Act, 2015; Ignore and focus on work","D.\tChild and Adolescent Labour (Prohibition and Regulation) Amendment Act, 2016; Report to the labor department",


            "  A.\tKeep it a secret to avoid embarrassment","  B.\tConfront the neighbor alone"," C.\tReport the incident to the school teacher or parents"," D.\tIgnore the situation and try to avoid the neighbor",


            " A.\tKeep it a private matter within the family","\n" +
            "    B.\tSeek help from local NGOs or support groups","   C.\tIgnore the disability and focus on other aspects of life"," D.\tAccept the situation and isolate oneself",

            "A.\tAgree to the marriage to avoid family conflict.","B.\tSeek guidance from friends of similar age"," C.\tReport the situation to the local police or child helpline","\n" +
            "            D.\tRun away from home to escape marriage",


            "A.\tAvoid family gatherings to prevent uncomfortable situations"," B.\tShare the concern with parents  or a trusted adult.","    C.\tConfront the relative directly during the next gathering.","   D.\tIgnore the discomfort and endure the touch silently",};

    String[] Correct_List={"","","","","","","","","",""};


        TextView srt_question, text_question;
        Button btn_choose1  ,btn_choose2,btn_choose3, btn_choose4,btn_next;
 int currentQuestion=0;
  boolean isclickBtn=false;
  String valueChoose="";
  Button btn_click;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_lab_test);
        srt_question=findViewById(R.id.srt_question);
       // btn_next=findViewById(R.id.btn_next);
        btn_choose1=findViewById(R.id.btn_Choose1);
                btn_choose2=findViewById(R.id.btn_Choose2);
        btn_choose3=findViewById(R.id.btn_Choose3);
                btn_choose4=findViewById(R.id.btn_Choose4);
        remplirData();

btn_next.setOnClickListener(
        view -> {
            if(isclickBtn){
                if(!valueChoose.equals(Correct_List[currentQuestion])){
                    Toast.makeText(SRT_Quizes.this, "error", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SRT_Quizes.this, "correct", Toast.LENGTH_SHORT).show();

                }
                new Handler().postDelayed(() ->{
                    currentQuestion=currentQuestion +1;
                    remplirData();
                    isclickBtn=false;
                    valueChoose="";


                        },2000);
                btn_choose1=findViewById(R.id.btn_Choose1);
                btn_choose2=findViewById(R.id.btn_Choose2);
                btn_choose3=findViewById(R.id.btn_Choose3);
                btn_choose4=findViewById(R.id.btn_Choose4);







            }
        }
);







    }

    private void remplirData() {
        srt_question.setText((currentQuestion+1) + "/" + Question_List);
        text_question.setText(Question_List[currentQuestion]);


        btn_choose1.setText(Choose_List[currentQuestion]);
        btn_choose2.setText(Choose_List[currentQuestion]);
        btn_choose3.setText(Choose_List[currentQuestion]);
        btn_choose4.setText(Choose_List[currentQuestion]);

    }
    public void ClickChoose(View view){
        if(!isclickBtn){
             btn_click=(Button)view;
            btn_click.setBackgroundResource(R.drawable.background_selector);
                isclickBtn=true;
                valueChoose=btn_click.getText().toString();
        }
    }




/* btnGoToCart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestActivity.this,CartLabActivity.class));
            }
        });*/
    }
