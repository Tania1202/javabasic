package homework;

import java.util.Scanner;

public class City_Temp {
    public static void main(String[] args) {
        //Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and
        // print “The temperature is the city  is ”
        Scanner input = new Scanner(System.in);
        System.out.println("What is your city?");
        String city = input.nextLine();
        System.out.println("What is your temp?");
        int temp = input.nextInt();
        double tempC = (temp - 32) * 0.5556;
        int convertedC = (int) tempC;
        System.out.println("The temp in  " + city + " is " + convertedC + " C");
    }

}
