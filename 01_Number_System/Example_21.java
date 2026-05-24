//WAP to define a method to cehck the given number is neo number or not
public class Example_21 {
    public static void main(String[] args) {
        int n = 9;
        if (isNeon(n))
            System.out.println("it is neon number");
        else
            System.out.println("its not a neon number");

    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) {
            int digit = sq % 10;
            sum = sum + digit;
            sq = sq / 10;
        }
        return sum == n;
    }
}