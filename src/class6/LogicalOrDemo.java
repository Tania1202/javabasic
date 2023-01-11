package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        System.out.println("Please enter the day");
        Scanner scanner=new Scanner(System.in);
        String day= scanner.next();

        if (day.equals("Monday")||day.equals("Friday")) {
            System.out.println("No Class Today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java Classes");
        }else if(day.equalsIgnoreCase("Wednesday")|| day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing");
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }
    }
}
