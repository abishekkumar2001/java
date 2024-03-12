import java.util.Scanner;

public class DataTypes{

    public static void main(String args[]){

        //Primitive datatypes
        System.out.println("Primitive Data Types");
        System.out.println("1.Byte");
        System.out.println("2.Short");
        System.out.println("3.Integer");
        System.out.println("4.Long");
        System.out.println("5.Float");
        System.out.println("6.Double");
        System.out.println("7.Character");
        System.out.println("8.Boolean");

        //Integer datatypes
        byte b = 5;   //Size is 1 byte
        short s = 25; //Size is 2 bytes
        int i = 1000; //Size is 4 bytes
        long l = 125000; //Size is 8 bytes

        System.out.println("The value stored in byte data type is : " + b);
        System.out.println("The value stored in short is : " + s);
        System.out.println("The value stored in integer is : " + i);
        System.out.println("The value stored in long is : " + l);

        //Float datatypes
        float f = 4.52f; //Size is 4 bytes
        double d = 7.183476; //Size is 8 bytes
        double exp = 7183476e-06;

        System.out.println("The value of float data type is : " + f);
        System.out.println("The value of double data type is : " + d);
        System.out.println("The value of exp variable is : " + exp);

        char c = 'a'; //Size is 2 bytes
        boolean bool = true;

        System.out.println("The character entered is : " + c);
        System.out.println("The boolean value is : " + bool);

        //Non Primitive Data types
        System.out.println("Non Primitive Data types");
        System.out.println("1.String");
        System.out.println("2.Array");

        //Arrays

        int arr[] = new int[4]; //Memory for array will be allocated only after seeing new keyword ...
        arr[0] = 25;
        arr[1] = 34;
        arr[2] = 96;
        arr[3] = 78;
        //It can also be written as int arr[] = {25,34,96,78}

        System.out.println(arr[2]);

        int a[][] = new int[2][3];  //Array Creation
        a[0][0] = 12;
        a[1][1] = 27;
        a[1][2] = 100;

        System.out.println(a[0][1]); //Default value will get printed
        System.out.println(a[1][1]); 

        //Can also be written like char []c1,c2,c3;

        /*  Two dimensional array .... with variable number of columns
            int a[4][];
            a[0] = new int[5];
            a[1] = new int[100];
            a[2] = new int[99];
            a[3] = new int[6];
        */

       //Getting values from the user using Scanner class

       String name ;
       Scanner scanner = new Scanner(System.in); //object for getting values from the user
       System.out.println("Enter the name : ");
       name = scanner.nextLine();

       int age;
       System.out.println("Enter the age : ");
       age = scanner.nextInt();

       char letter;
       System.out.print("Enter the first letter of your name : "); //Does not print new line
       letter = scanner.next().charAt(0);

       float rating;
       System.out.println("Enter your rating ... ");
       rating = scanner.nextFloat();

       System.out.println("Your rating is : " + rating);

       //We can use scanner.nextByte() for byte data type
       //We can use scanner.nextShort() for short data type
       //We can use scanner.nextLong() for long data type
       //We can use scanner.nextDouble() for double data type

       boolean ticketBooked;
       System.out.println("Confirm whether you have booked your ticket?");
       ticketBooked = scanner.nextBoolean();

       System.out.println("The name entered is : " + name);
       System.out.println("The Age is : " + age);
       System.out.println("The first letter of your name is : " + letter);
       System.out.println("You have entered ... " + ticketBooked);

    }
    
}