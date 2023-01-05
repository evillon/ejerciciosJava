import java.util.Scanner;

import static java.lang.System.out;

public class Prog1{
    public static void main(String[] args){

        out.print("Ingrese numero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n > 30) {
            out.println("No puede ingresar un numero mayor a 30");
            return;
        }
        out.println(" "+n+" El número total de conejos por mes es "+fun(n));
    }
    private static int fun(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}