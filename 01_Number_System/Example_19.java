//wap to defineMethod in a number

public class Example_19 {
    public static void main(String[] args) {
        int n = 2345;
        System.out.println(ProductofDigit(n));
    }

    public static int ProductofDigit(int n) {
        int prod = 1;
        while (n > 0) {
            int digit = n / 10;
            prod = prod * digit;
            n = n / 10;
        }
        return prod;
    }
}