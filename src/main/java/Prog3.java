import static java.lang.System.out;

public class Prog3{
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            if(isLotus(i))
                out.print(i+" ");
        }
        out.println();
    }
    // Juzgando el número de narcisos
    private static boolean isLotus(int lotus){
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n/100;
        n  -= m*100;
        sum = m*m*m;
        m = n/10;
        n -= m*10;
        sum += m*m*m + n*n*n;
        return sum == lotus;
    }
}