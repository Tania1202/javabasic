package homework;

import java.util.Scanner;

public class homework {

    public static void main(String[] args) {

        double number1, number2, number3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        number3 = scan.nextDouble();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Number is the largest " + number1);
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("Number 2 is largest " + number2);
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println("Number 3 is largest " + number3);
        }
    }
}

