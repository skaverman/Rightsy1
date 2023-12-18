package com;

public class QuestionsList {
    private String question,Option1,Option2,Option3,Option4,answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String option1, String option2, String option3, String option4, String answer, String userSelected) {
        this.question = question;
        Option1 = option1;
        Option2 = option2;
        Option3 = option3;
        Option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelected;

    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {

        return Option1;

    }

    public String getOption2() {

        return Option2;
    }

    public String getOption3() {
        return Option3;
    }

    public String getOption4() {
        return Option4;
    }

    public String getAnswer() {

        return answer;

    }

    public QuestionsList(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String setUserSelectedAnswer(String selectedOptionByUser) {
        return userSelectedAnswer;
    }

}
