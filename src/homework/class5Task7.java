package homework;

import java.util.Scanner;

public class class5Task7 {
    public static void main(String[] args) {
        //7) Ask user to enter their country and capture it.
        // Once values are captured print which language user speaks.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = input.nextLine();
        switch (country) {
            case "USA":
                System.out.println("You speak English");
                break;
            case "Ukraine":
                System.out.println("You speak Ukrainian");
                break;
            case "France":
                System.out.println("You speak French");
                break;
            case "China":
                System.out.println("You speak Chinese");
                break;
            default:
        }
    }
}
