package com.Kloudiator.Java.FirstProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] preposition1s = {"1   equal()", "2   equals()", "3   isequals()", "4   isequal()"};
        Question question1 = new Question("Which of these methods of the String class can be used to test string equality?", preposition1s, 2);
        String[] preposition2s = {"1    JVM", "2    JDK", "3    JIT", "4    JRE"};
        Question question2 = new Question("Which component is used to compile, debug and run a java program?", preposition2s, 2);
        Question question3 = new Question("Which component is responsible for converting byte-codes into machine-specific code?", preposition2s, 1);
        Question question4 = new Question("Which component is responsible for running the Java program?", preposition2s, 4);
        Question question5 = new Question("What is a correct syntax to output \"Hello World\" in Java?", new String[]{"1     Console.WriteLine(\"Hello World\");", "2     echo(\"Hello World\");", "3      System.out.println(\"Hello World\");", "4      print (\"Hello World\");"}, 3);
        Question question6 = new Question("How do you insert COMMENTS in Java code?", new String[]{"1     # This is a comment", "2     // This is a comment", "3      /* This is a comment", "4     & this is a comment"}, 2);
        Question question7 = new Question("Which data type is used to create a variable that should store text?", new String[]{"1    Txt", "2      string", "3     String", "4     MyString"}, 3);

        Question[] questions = {question1, question2, question3, question4, question5, question6, question7};

        Scanner scanner = new Scanner(System.in);
        Qcm qcm = new Qcm(questions);
        System.out.println("    **********   welcome to java test  ************");
        System.out.println("    **********   fill in the following informations please   ************");
        System.out.println("firs name :");
        qcm.setFirstName(scanner.nextLine());
        System.out.println("last name :");
        qcm.setLastName(scanner.nextLine());
        System.out.println("email :");
        qcm.setEmail(scanner.nextLine());
        // System.out.println("    **********   the test will be started now its a quiz you will choose the  number of the rigth answer    ************");
        String response = "";
        do {
            System.out.println("    **********   please press Y to start the exam  ************");
            response = scanner.next();

        }
        while (!response.equals("Y"));

        qcm.startExam();
        int score = qcm.scoreCalculation();
        if (score < 50) {
            System.out.println("sorry " + qcm.getFirstName() + " " + qcm.getLastName() + " you have failed the exam your score is under then 50 :( . ");
            //System.out.println("your score is  "+qcm.scoreCalculation()+"%");
        } else {
            System.out.println("Congratulation " + qcm.getFirstName() + " " + qcm.getLastName() + " you pass the exam successfully  you will receive the certificate from your email :" + qcm.getEmail());
        }
        System.out.println("your score is  " + qcm.scoreCalculation() + "%");
    }

}

