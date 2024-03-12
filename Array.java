import java.util.Scanner;

public class Array{

    public static void main(String args[]){

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


    }

}