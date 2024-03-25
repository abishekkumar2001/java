public class Sum{
       public int sumofDigits(int number){
        int i,d,sum = 0;
        while(number>0){
            d = number;
            d = d%10;
            sum = sum + d;
            number = number/10;
        }
        return sum;
    }
}