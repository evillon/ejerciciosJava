import java.util.Scanner;
public class Prog39{
    public static void main(String[] args){
        System.out.print("Introduzca un número entero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2==0)
            System.out.println("resultado:"+even(n));
        else
            System.out.println("resultado:"+odd(n));
    }
    //número impar
    static double odd(int n){
        double sum = 0;
        for(int i=1;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
    //incluso
    static double even(int n){
        double sum = 0;
        for(int i=2;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
}