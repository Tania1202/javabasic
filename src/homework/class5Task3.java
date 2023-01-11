package homework;

import java.util.Scanner;

public class class5Task3 {
    public static void main(String[] args) {
        //3) Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        // and determine the grade based on the following rules:
        //if the average score >=90 → grade=A
        //if the average score >= 70 and <90 → grade=B
        //if the average score>=50 and <70 → grade=C
        //if the average score<50 → grade=F
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz score?");
        int quiz = input.nextInt();
        System.out.println("Please enter your mid term?");
        int midterm = input.nextInt();
        System.out.println("Please enter your final scores?");
        int finalsc = input.nextInt();
        int average = ((quiz + midterm + finalsc) / 3);
        System.out.println("Your averege is " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade B");
        } else if (average >= 50 && average < 70) {
            System.out.println("Grade C");
        } else if (average < 50) {
            System.out.println("GradeF");
        }
    }
}
