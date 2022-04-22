package com.Kloudiator.Java.FirstProject;

public class Question
{
    private String question;
    private   String [] prepositions;
    private int rightAnswer;
    private int response;

    public Question(String question, String[] prepositions, int rightAnswer) {
        this.question = question;
        this.prepositions = prepositions;
        this.rightAnswer = rightAnswer;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String[] prepositions) {
        this.prepositions = prepositions;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }





}
