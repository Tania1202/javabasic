package homework;

import java.util.Scanner;

public class class5Task2 {
    public static void main(String[] args) {
        //2) Write a program that will print whether it is a weekend or weekday.
        // If any day from 1-5 → output “It is a weekday”,
        // anyday from 6-7 → output “It is a weekend”,
        // any other day → output “Invalid day”
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of the day");
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
