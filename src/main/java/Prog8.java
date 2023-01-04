import java.util.Scanner;

public class Prog8{
    public static void main(String[] args){
        System.out.print("Para el valor de s = a + aa + aaa + aaaa + ..., ingrese el valor de a:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s*");// Usa el espacio como separador
        int a = scan.nextInt();
        int n = scan.nextInt();
        scan.close();// Cerrar el escáner
        System.out.println(expressed(2,5)+add(2,5));
    }
    // Expresión de suma
    private static String expressed(int a,int n){
        StringBuffer sb = new StringBuffer();
        StringBuffer subSB = new StringBuffer();
        for(int i=1;i<n+1;i++){
            subSB = subSB.append(a);
            sb = sb.append(subSB);
            if(i<n)
                sb = sb.append("+");
        }
        sb.append("=");
        return sb.toString();
    }
    //Suma
    private static long add(int a,int n){
        long sum = 0;
        long subSUM = 0;
        for(int i=1;i<n+1;i++){
            subSUM = subSUM*10+a;
            sum = sum+subSUM;
        }
        return sum;
    }
}
