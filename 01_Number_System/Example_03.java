class Example03 {
    public static void main(String[]args){
        int a=50, b=30 ,c=40;

        int small=a;
        if(small>b)
            small=b;
        if(small>c)
            small=c;
        System.out.println(small);
    }
}
