package homework;

import java.util.Scanner;

public class class5Task4 {
    public static void main(String[] args) {
        //4)Write a program for user to enter his/hers birth month.
        // Based on the month define the season.
        //Example: if user is born in June, July or August → season =”Summer”.
        //At the end of the program we should see output as “You were born __”.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month?");
        String month = input.nextLine();

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("You was born in winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("You was born in spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You was born in summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You was born in fall");
                break;
            default:


        }

    }
}
