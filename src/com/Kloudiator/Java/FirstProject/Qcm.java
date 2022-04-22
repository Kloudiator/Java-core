package com.Kloudiator.Java.FirstProject;

import java.util.Scanner;

public class Qcm
{
    private  String firstName;
    private String lastName;
    private String email;
    private Question[] questions;



    public Qcm() {
    }
    public Qcm(Question[] questions) {
        this.questions = questions;
    }

    public Qcm(String firstName, String lastName, String email,Question[] questions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.questions = questions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
    public  int scoreCalculation()
    {
        int sum=0;
        for(int i=0;i<this.questions.length;i++)
        {
            if(questions[i].getResponse()==questions[i].getRightAnswer())
                sum++;
        }
        float result= ((float) sum/(float) questions.length)*100;
        return (int) result;
    }
    public  void startExam()
    {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<questions.length;i++)
        {
            System.out.println("Question number :" +(i+1));
            System.out.println(questions[i].getQuestion());
            for(String prop:questions[i].getPrepositions())
                System.out.println(prop);
            System.out.println("please choose your response ...");
            // int nombre=q.getUserInputWithTimeout(10);
            int nombre = scanner.nextInt();
            // verifier eli nombre mebin les proposition sinon ygolou 3awed
            questions[i].setResponse(nombre);
        }
    }
}
