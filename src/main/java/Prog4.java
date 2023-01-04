/*
(1) Si este número primo es exactamente igual an, significa que el proceso de descomposición de factores primos ha terminado, simplemente imprímalo.
(2) Si n <> k, pero n es divisible por k, se debe imprimir el valor de k, y el cociente de n dividido por k se usa como un nuevo entero positivo n, y se repite el primer paso.
(3) Si n no es divisible por k, use k +1Como valor de k, repita el primer paso.
*/
public class Prog4{
    public static void main(String[] args){
        int n = 200;
        decompose(n);
    }
    private static void decompose(int n){
        System.out.print(n+"=");
        for(int i=2;i<n+1;i++){
            while(n%i==0 && n!=i){
                n/=i;
                System.out.print(i+"*");
            }
            if(n==i){
                System.out.println(i);
                break;
            }
        }
    }
}
