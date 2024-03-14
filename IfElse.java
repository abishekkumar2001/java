import java.util.*;

public class IfElse{

    public static void main(String args[]){
        
        //If ... Else if .... Else
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b : ");
        b = scanner.nextInt();
        if(a>b){
            System.out.println("larger number is a and the number is " + a);
        }
        else if(a<b){
            System.out.println("larger number is b and the number is " + b);
        }
        else{
            System.out.println("The number a and b are equal and the number is " + a);
        }

        //Loops

        //For loop ... Example 1
        int i,j,n;
        System.out.println("Enter the value of n");
        n = scanner.nextInt();
        System.out.println("For Loop");
        for(i=1;i<=n;i++){
            System.out.print(i);
        }
        System.out.print("\n");

        //While loop
        System.out.println("While Loop");
        i=0;
        while(i<n){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");

        //Do while loop ... 
        System.out.println("Do while Loop");
        i = 1;
        do{
            System.out.print(i);
            i++;
        }while(i<=n);
        System.out.print("\n");

        //for loop ... Example 2
        System.out.println("Inner For Loop");
        for(i=1;i<=5;i++){
            System.out.println("Iteration " + i);
            for(j=1;j<5;j++){
                if(i==1 && j==1)
                    continue;
                System.out.print("*");
            }
            if(i==2)
                break;
            System.out.print("\n");
        }
        System.out.print("\n");
        
        //Switch
        System.out.println("Switch");
        int num1,num2;
        System.out.println("Enter the value of num1 and num2");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        char op;
        int result;
        System.out.println("Enter the operator");
        op = scanner.next().charAt(0);
        switch(op){
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case '-':
                result = num1-num2;
                System.out.println(result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(result);
                break;
            case '%':
                result = num1%num2;
                System.out.println(result);
                break;
            default :
                System.out.println("Invalid Operator");
        }

    }

}