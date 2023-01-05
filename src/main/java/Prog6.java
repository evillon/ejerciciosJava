import static java.lang.System.out;

public class Prog6{
    public static void main(String[] args){
        int m;
        int n;
        try{
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            out.println("Error de entrada");
            return;
        }
        maxmin(m,n);
    }
    // Encuentra el máximo común divisor y el mínimo común múltiplo
    private static void maxmin(int m, int n){
        int temp = 1;
        int yshu = 1;
        int bshu = m*n;
        if(n<m){
            temp = n;
            n = m;
            m = temp;
        }
        while(m!=0){
            temp = n%m;
            n = m;
            m = temp;
        }
        yshu = n;
        bshu /= n;
        out.println(m+"con"+n+"El máximo común divisor es"+yshu);
        out.println(m+"con"+n+"El mínimo común múltiplo es"+bshu);
    }
}