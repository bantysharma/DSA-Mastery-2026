//WAP TO DEFINE METHOD TO COUNT HOW MANY DIGIT PRESENT
public class Example_18 {
    public static void main(String[]args) {
        int n=2345;
        System.out.println(CountDigit(n));
    }
    public static int CountDigit(int n){
        int count=0;
        while(n>0)
        {
            int digit=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
