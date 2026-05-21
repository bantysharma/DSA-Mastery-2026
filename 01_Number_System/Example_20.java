//wap to define A method to check the given number is SPY number or not

public class Example_20 {
    public static void main(String[] args) {
        int n = 22;
        if (isSpy(n)) {
            System.out.println("SPY NUMBER");
        }
        else
            System.out.println("NOT A SPY NUMBER");

    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            prod = prod * digit;
            n = n / 10;
        }
        return sum == prod;
    }
}