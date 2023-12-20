package com;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> SRTQuestions() {





        final List<QuestionsList> questionsLists= new ArrayList<>();



//create object of Questionlist  class and pass a question  along  with option and answer
        final QuestionsList question1 = new QuestionsList("1.Situation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?"," D.Encourage the child to continue working for extra income","C.Report the incident to the Child Helpline or local police"," B.Ignore the situation as it's part-time work "," A.Praise the child for learning work skills","A.Praise the child for learning work skills","");

        final QuestionsList question2 = new QuestionsList("2.Situation: A 10-year-old child is found working in a local shop after school hours. What is the appropriate action?","D.Report the incident to the school authority","C.Ignore the pressure and let the child decide","B.Enroll him in a rehabilation program","A.Allow the child to make an independent decision","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question3 = new QuestionsList("3.Situation: A 14-year-old boy is found involved in a minor theft. What legal action can be taken under the applicable law?","D.Report the incident to the school authorities","C. Ignore the situation as it just a minor offense","B.Convince the parents about the importance of education","A.Allow the child to make an independent decision","","");
        final QuestionsList question4 = new QuestionsList("4.Situation: A 11-year-old child is being denied admission to a nearby school. What should the parents do?","D.Encourage the child to focus in extra circulam activites instead","C.Ignore the matter and look for other school","B.Report the incident to the  school authorities or local education board","D.Encourage the child to focus on extracurricular activities instead","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question5 = new QuestionsList("5.Situation: A 12-year-old girl is found with signs of malnutrition. What is the immediate course of action?","D.Provide the child with extra food at home","C. Consult a local health care professional ","B.Report the incident to the school teacher","A. Ignore the situation as it might be temporary","D. Report to the labour department","");
        final QuestionsList question6 = new QuestionsList("6.Situation: A 15-year-old is found working in hazardous conditions. What law prohibits this, and what should be done?","D.Report to the labour department. ","C.Ignore and focus on work","B.Continue working, to support the family","A.Report to the labour union","C. Report the incident to the Child Helpline or local police","");
        final QuestionsList question7 = new QuestionsList("7.Situation: A 9-year-old child is being sexually harassed by a neighbor. What is the appropriate action?","D.Ignore the situation","C.Report the incident to the school teacher and parents","B.Confront the neighbour alone","A.Keep it a secret to avoid embarrassment","C.Report the incident to the school teacher or parents","");
        final QuestionsList question8 = new QuestionsList("8.Situation: A 16-year-old is struggling with a disability and is not receiving adequate support. What action should be taken?","D.Accept the situation and isolate one self","C.Ignore the disability and focus on other aspects of life","B.Seek help from local NGOs or support groups","A.Keep it a private matter within the family","B.Seek help from local NGOs or support groups","");
        final QuestionsList question9 = new QuestionsList("9.Situation: A 16-year-old girl is being pressured into an early marriage by her family what should the girl do?","D. Runaway from home to escape marriage","C.Report the situation to the local police or child helpline","B.Seek guidance from friends of similar age","A.Agree to the marriage to avoid family conflict","C.Report to the situation to the local police or child helpline","");
        final QuestionsList question10 = new QuestionsList("10.A 12- year old is uncomfortable with the touch of a relative during the family gatherings. How should the child handle this situation?","D.Ignore the discomfort and endure the touch silently","C.Confront the relative directly during the next gathering","B.Share the concern with parents  or a trusted adult"," A.Avoid family gathering to prevent uncomfortable situation","B.Share the concern with parents or trusted adults","");

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


        final QuestionsList question1 = new QuestionsList("1.At what age do Indian children acquire the right to education according to the fundamental rights?", "D) 12 years", "C) 10 years", "B) 8 years", "A) 5 years", "C) 10 years", "");

        final QuestionsList question2 = new QuestionsList("2.Which fundamental right ensures the protection of a child against exploitation and prohibits their employment in hazardous occupations?", "D) Right to Education", "C) Right against Exploitation", "B) Right to Equality", "A) Right to Freedom of Religion", "C) Right against Exploitation", "");
        final QuestionsList question3 = new QuestionsList("3.What is the age limit for a child to be protected against employment in any factory or mine under the Right against Exploitation?", "D) 16 years", "C) 14 years", "B) 12 years", "A) 10 years", "C) 14 years", "");
        final QuestionsList question4 = new QuestionsList("4.Under which fundamental right do children have the right to freedom of speech and expression?", "D) Right to Constitutional Remedies", "C) Right to Life and Personal Liberty", "B) Right to Equality", "A) Right to Freedom", "A) Right to Freedom", "");
        final QuestionsList question5 = new QuestionsList("5.Which fundamental right ensures equal opportunities for education to all children irrespective of their caste, creed, or gender?", "D) Right to Education", "C) Right against Exploitation", "B) Right to Equality", "A) Right to Freedom", "", "");
        final QuestionsList question6 = new QuestionsList("6.Under which fundamental right do children have the right to participate in cultural and educational activities?", "D) Right to Life and Personal Liberty", "C) Right to Cultural and Educational Rights", "B) Right to Equality", "A) Right to Freedom", " C) Right to Cultural and Educational Rights", "");
        final QuestionsList question7 = new QuestionsList("7.What is the maximum age for a child to be protected against employment in any hazardous occupation under the Right against Exploitation?", "D) 18 years", "C) 16 years", "B) 14 years", "A) 12 years", "D) 18 years", "");
        final QuestionsList question8 = new QuestionsList("8.Which fundamental right ensures the protection of the interests of minorities and children?", "D) Right to Constitutional Remedies", "C) Right against Exploitation", "B) Right to Equality", "A) Right to Freedom", " D) Right to Constitutional Remedies", "");
        final QuestionsList question9 = new QuestionsList("9.What is the age limit for a child to have the right to vote in India?", "D) 25 years", "C) 21 years", "B) 18 years", "A) 16 years", "B) 18 years", "");
        final QuestionsList question10 = new QuestionsList("10.Under which fundamental right are children protected against being trafficked and forced into bonded labor?", "D) Right to Constitutional Remedies", "C) Right against Exploitation", "B) Right to Equality", "A) Right to Freedom", "C) Right against Exploitation", "");
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
