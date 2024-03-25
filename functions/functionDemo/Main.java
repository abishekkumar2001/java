import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = scanner.nextInt();
        Sum s = new Sum(); //Creating object for class sum
        int value = s.sumofDigits(a);
        System.out.println("The sum is " + value);
    }

}