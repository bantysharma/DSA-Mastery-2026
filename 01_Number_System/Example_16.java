//wap to define  a method n=n^2 pow3

public class Example_16 {
    public static void main(String[]args) {
        int n =2, p =3;
        int result = Power(n, p);
        System.out.println(n + " ki power " + p + " hai: " + result);
    }
    static int Power(int n,int p){
        int pow=1;
        for(int i=1;i<=p;i++){
            pow=pow*n;
        }
        return pow;
    }
}
