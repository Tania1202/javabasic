package homework;

public class task4 {
    public static void main(String[] args) {
        // Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”
        //Expected Output:
        //The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
        //The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
        //The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
        //The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
        //Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
        //Expected output:
        //
        //The square of the 3.9 is 15.209999999999999
        float num1 = 10.5f;
        float num2 = 10.5f;
        System.out.println("The Additional of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
        System.out.println("The Subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
        System.out.println("The Multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
        System.out.println("The Division of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2));

        float num3 = 3.9f;
        System.out.println("The square of the " + num3 + " is " + (num3 * num3));

    }
}
