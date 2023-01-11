package homework;

import java.util.Scanner;

public class class5Task8 {
    public static void main(String[] args) {
        //Allow user to enter grade and then provide explanation
        // : A-Excellent, B-Good, C-Average, D-Bad, any other grade -->
        // Not Acceptable.
        // At the end your program should print which grade was entered by a user with explanation.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade = input.nextLine();
        switch (grade) {
            case "A":
                System.out.println("A-Excellent");
                break;
            case "B":
                System.out.println("B-Good");
                break;
            case "C":
                System.out.println("C-Average");
                break;
            case "D":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("NotAcceptable");
        }
    }
}
