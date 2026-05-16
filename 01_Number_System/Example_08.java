//WAP to check the given number year is LeapYear or Not
class Example_08 {
    public static void main(String[]args) {
        int y=2026;
        if(y%4==0 && y%100!=0){
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not A Leap Year");

    }
}
