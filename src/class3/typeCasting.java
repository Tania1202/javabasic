package class3;

public class typeCasting {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);
        byte b =10;
        int number2=b;
        short c=(short)number2;
        System.out.println(b);

        System.out.println(10>5);//if 10 greater than 5 true
        System.out.println(5>10);//if 5 greater than 10 false
        System.out.println(5!=10);//if 5 not equal to 10 true
        System.out.println(5==10);//if 5 equal to 10 false
        System.out.println(5==5);//if 5 equal to 5 true
        System.out.println(10>=20);//if 10 greater or equal to 20 false
        System.out.println(10<=20);//if 10 less or equal to 20 true
        System.out.println(10<=10);//if 10 less or equal to 10 true

        // == equal to, != not equal to, >greater than, <less than, >=greater or equal, <=less or equal.


        float eggs=12.5f;
        int wholePart=(int)eggs;// type casting we are converting from float to int
        System.out.println(wholePart);

        int number4=10;
        int number5=10;
        System.out.println(number4+number5);
        boolean result=20>10;
        System.out.println(result);
    }
}
