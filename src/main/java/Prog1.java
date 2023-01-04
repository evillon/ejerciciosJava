public class Prog1{
    public static void main(String[] args){
        int n = 6;
        System.out.println(" "+n+" El número total de conejos por mes es "+fun(n));
    }
    private static int fun(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}