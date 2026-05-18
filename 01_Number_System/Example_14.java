//METHO QUESTION START HERE
//WAP TO DEFINE A METHOD TO CREATE THE GIBEN NUMBER IS PERFECT OR NOT
public class Example_14 {
    public static void main(String[] args) {
        int n=10;
        isPrefect(n);
    }
     public static void isPrefect(int n){
        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum =sum+i;

        }
        if (sum==n)
            System.out.println("its a perfect number");
        else
            System.out.println("its not perfect number");
     }
}