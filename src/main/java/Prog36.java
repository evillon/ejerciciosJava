import java.util.Scanner;
public class Prog36{
    public static void main(String[] args){
        final int N = 10;
        System.out.print("Ingrese una matriz de 10 números:");
        Scanner scan = new Scanner(System.in);
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
            a[i] = scan.nextInt();
        System.out.print("Introduzca un número menor que 10:");
        int m = scan.nextInt();
        scan.close();
        int[] b = new int[m];
        int[] c = new int[N-m];
        for(int i=0;i<m;i++)
            b[i] = a[i];
        for(int i=m,j=0;i<N;i++,j++)
            c[j] = a[i];
        for(int i=0;i<N-m;i++)
            a[i] = c[i];
        for(int i=N-m,j=0;i<N;i++,j++)
            a[i] = b[j];
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}