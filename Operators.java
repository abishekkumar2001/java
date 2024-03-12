import java.util.Scanner;

public class Operators{

    public static void main(String args[]){

        //Arithmetic operators
        int a1,b1,sum;
        Scanner scanner = new Scanner(System.in); //Scanner is class ... scanner is object ....
        System.out.println("Enter the value of a1 and b1 : ");
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        sum = a1+b1;

        System.out.println("The sum of a and b is : " + sum);

        int a2,b2,difference;
        System.out.println("Enter the value of a2 and b2 : ");
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();
        difference = a2-b2;
        System.out.println("The difference of a2 and b2 is : " + difference);

        int num1 = 5,num2 = 6,product;
        product = num1*num2;
        System.out.println("The product of num1 and num2 is : " + product);

        num1 = 35;
        num2 = 7;
        int div,rem;
        div = 35/7;
        rem = 35%7;
        System.out.println("The division value of num1 and num2 is : " + div);
        System.out.println("The remainder value of num1 and num2 is : " + rem);

        //Relational operators
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(a1>=b1);
        System.out.println(a2<=b2);
        System.out.println(num1!=num2);
        System.out.println(a1==b2);

        //Bitwise operators
        int result1,result2;
        result1 = 3&5;
        result2 = 5|7;      
        System.out.println("The result of bitwise AND is " + result1 + " and the result of bitwise OR is " + result2);  

        //Increment and decrement operators
        int a = 10,b=10,c=10,d=10,e=10,result3;
        result3 = a++; //Post Increment
        System.out.println("The value of result3 is " + result3 + " and the value of a is " + a);
        result3 = b--;
        System.out.println("The value of result3 is " + result3 + " and the value of b is " + b);
        result3 = --c; //Pre Decrement
        System.out.println("The value of result3 is " + result3 + " and the value of c is " + c);
        result3 = ++d;
        System.out.println("The value of result3 is " + result3 + " and the value of d is " + d);
        result3 = e++ + ++e - e-- - --e + e++;
        System.out.println("The value of result3 is " + result3 + " and the value of e is " + e);
        
    }

}