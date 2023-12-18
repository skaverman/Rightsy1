package com;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> SRTQuestions() {

final List<QuestionsList> questionsLists= new ArrayList<>();

//create object of Questionlist  class and pass a question  along  with option and answer
        final QuestionsList question1 = new QuestionsList("1.\tSituation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?","\tPraise the child for learning work skills","","","","","");

        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");
        final QuestionsList question4 = new QuestionsList("","","","","","","");
        final QuestionsList question5 = new QuestionsList("","","","","","","");
        final QuestionsList question6 = new QuestionsList("","","","","","","");
        final QuestionsList question7 = new QuestionsList("","","","","","","");
        final QuestionsList question8 = new QuestionsList("","","","","","","");
        final QuestionsList question9 = new QuestionsList("","","","","","","");
        final QuestionsList question10 = new QuestionsList("","","","","","","");
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
