package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class class5Task9 {
    public static void main(String[] args) {
        //Using scanner class create calculator.
        // Allow user to enter 2 numbers and operator(+,-,*,/).
        // Based on operator provide the result to user.

        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Please enter two numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Please enter any operator(+,-,*,/)");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
        }


    }

}

