package com;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> SRTQuestions() {





        final List<QuestionsList> questionsLists= new ArrayList<>();

//create object of Questionlist  class and pass a question  along  with option and answer
        final QuestionsList question1 = new QuestionsList("1.\tSituation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?","A.\tPraise the child for learning work skills","B.\tIgnore the situation as it's part-time work"," C.\tReport the incident to the Child Helpline or local police"," D.\tEncourage the child to continue working for extra income","C. Report the incident to the Child Helpline or local police","");

        final QuestionsList question2 = new QuestionsList("2.\tSituation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?","A.\tAllow the child to make an independent decision","B.\tConvince the parents about the importance of education","C.\tIgnore the pressure and let the child decide"," D.\tReport the incident to the school authorities","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question3 = new QuestionsList("3.\tSituation: A 14-year-old boy is found involved in a minor theft. What legal action can be taken under the applicable law?"," A.\\tTreat him as an adult and involve the police"," B.\\tEnroll him in a rehabilitation program"," C.\\tIgnore the situation as it's just a minor offense"," D.\tSuspend him from school","","");
        final QuestionsList question4 = new QuestionsList("4.\tSituation: An 11-year-old child is being denied admission to a nearby school. What should the parents do?","A.\tAccept the situation and explore home schooling","B.\tReport the incident to the school authorities or local education board","C.\tIgnore the matter and look for other schools","D.\tEncourage the child to focus on extracurricular activities instead","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question5 = new QuestionsList("5.\tSituation: A 12-year-old girl is found with signs of malnutrition. What is the immediate course of action?","A.\tIgnore the situation as it might be temporary","B.\tConsult a local healthcare professional","C.\tReport the incident to the school teacher","D.\tProvide the child with extra food at home","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question6 = new QuestionsList("6.\tSituation: A 15-year-old is found working in hazardous conditions. What law prohibits this, and what should be done?","A.\tRight to Education Act, 2009; Report to the labour union","C.\\tReport the incident to the school teacher or parents","","","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question7 = new QuestionsList("7.\tSituation: A 9-year-old child is being sexually harassed by a neighbor. What is the appropriate action?","A.\\tKeep it a secret to avoid embarrassment","B.\\tConfront the neighbor alone","C.\\tReport the incident to the school teacher or parents","D.\tIgnore the situation and try to avoid the neighbor","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question8 = new QuestionsList("8.\tSituation: A 16-year-old is struggling with a disability and is not receiving adequate support. What action should be taken?","A.\tKeep it a private matter within the family","B.\tSeek help from local NGOs or support groups","C.\tIgnore the disability and focus on other aspects of life","D.\tAccept the situation and isolate oneself","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question9 = new QuestionsList("9.\tSituation: A 16-year-old girl is being pressured into an early marriage by her family what should the girl do?","","","","","","");
        final QuestionsList question10 = new QuestionsList("10.\tA 12- year old is uncomfortable with the touch of a relative during the family gatherings. How should the child handle this situation?","A.\tAvoid family gatherings to prevent uncomfortable situations","B.\tShare the concern with parents  or a trusted adult","C.\tConfront the relative directly during the next gathering"," D.\tIgnore the discomfort and endure the touch silently","C. Report the incident to the Child Helpline or local police","");
       //add all question to List<QuestionsList>

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);



return questionsLists;
    }

    private static List<QuestionsList> weekly_testQuestion() {
        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("", "", "", "", "", "", "");

        final QuestionsList question2 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question3 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question4 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question5 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question6 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question7 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question8 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question9 = new QuestionsList("", "", "", "", "", "", "");
        final QuestionsList question10 = new QuestionsList("", "", "", "", "", "", "");
        //add all question to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }
    public  static  List<QuestionsList> getQuestions(String selectedTopicName){
        switch(selectedTopicName){
            case "srt":
                return SRTQuestions();
            default:
                return weekly_testQuestion();

        }
    }

}
