package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter your age");
        int age = scan.nextInt();
        System.out.println("You are " + age + " Years old");
        System.out.println("Please Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("your weight is " + weight + " Kgs");
        System.out.println("Are you hungry");
        boolean hungry = scan.nextBoolean();
        System.out.println("Hungry " + hungry);
        System.out.println("Please Enter your full name ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is " + fullName);
        scan.close(); // Good practice
    }
}