import java.util.Scanner;
public class Prog44{
    public static void main(String[] args){
        System.out.print("Ingrese un número par:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2!=0){
            System.out.println("¡Lo que ingresaste no es un número par!");
            return;
        }
        twoAdd(n);
    }
    // El número par se descompone en la suma de números primos
    private static void twoAdd(int n){
        for(int i=2;i<n/2+1;i++){
            if(isPrime(i)&&isPrime(n-i)){
                System.out.println(n+"="+(i)+"+"+(n-i));
                break;
            }
        }
    }
    // Determinar números primos
    private static boolean isPrime(int m){
        boolean flag = true;
        for(int i=2;i<Math.sqrt(m)+1;i++){
            if(m%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}