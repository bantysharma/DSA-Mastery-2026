//wao ti define method of to print the sum of evendigit present in a number;

public class Example_22 {
    public static void main(String[] args) {
        int n = 246810;
        System.out.println(SumOfDigit(n));
    }

    public static int SumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }
}