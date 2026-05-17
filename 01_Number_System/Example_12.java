//WAP to count the number of factorial for the given number
 class Example_12 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0)
                count++;
        }
        count++;
        System.out.println(count);
    }
}