import java.util.*; //If the package is not sure can import like this

public class Input{ //Class name should be as same as file name ... The first letter should be in capital letter ....

    public static void main(String args[]){
        
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