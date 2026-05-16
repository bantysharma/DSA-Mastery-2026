//wap to print sanju if the divisible by 3,print gita if the number is divsible is 5
class Example_07 {
    public static void main(String[]args) {
        int n=15;
        if(n%3==0 && n%5==0){
            System.out.println("sanju weds gita");
        }
        else if (n%3==0){
            System.out.println("SANJU");
        }
        else if(n%5==0){
            System.out.println("Gita");
        }
        else
            System.out.println("breakup");

    }
}
