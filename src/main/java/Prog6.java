public class Prog6{
    public static void main(String[] args){
        int m,n;
        try{
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error de entrada");
            return;
        }
        max_min(m,n);
    }
    // Encuentra el máximo común divisor y el mínimo común múltiplo
    private static void max_min(int m, int n){
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
        System.out.println(m+"con"+n+"El máximo común divisor es"+yshu);
        System.out.println(m+"con"+n+"El mínimo común múltiplo es"+bshu);
    }
}