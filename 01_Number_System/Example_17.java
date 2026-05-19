//wap to define method to print sum of digit present in a number

public class Example_17 {
   public  static void main(String[]args) {
        int n=234;
        System.out.println(SumofDigit( n));

    }
    public static int  SumofDigit(int n){
        int sum=0;
        while(n>0)
        {
            int digit =n%10;
            sum =sum+digit;
            n=n/10;

        }
        return sum;
    }
}
