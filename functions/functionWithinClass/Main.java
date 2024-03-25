import java.util.Scanner;
public class Main{
    static int sumofDigits(int number){
        int i,d,sum = 0;
        while(number>0){
            d = number;
            d = d%10;
            sum = sum + d;
            number = number/10;
        }
        return sum;
    }
    public static void main(String args[]){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = scanner.nextInt();
        int sumValue = sumofDigits(a);
        System.out.println("The sum is " + sumValue);
    }
}