import static java.lang.System.out;

public class Prog2{
    public static void main(String[] args){
        int m = 1;
        int n = 1000;
        int count = 0;
        // Cuenta el número de números primos
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                count++;
                out.print(completaEspacios(i+" "));
                if(count%10==0){
                    out.println();
                }
            }
        }
        out.println();
        out.println("en "+m+" con "+n+" Compartido entre "+count+" Un número primo");
    }
    // Determinar números primos
    private static boolean isPrime(int n){
        boolean flag = true;
        if(n==1)
            flag = false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    private static String completaEspacios(String valor){
        if (valor.length()== 2)
            return " ".concat(" ").concat(valor);
        else if (valor.length() == 3) {
            return " ".concat(valor);
        }
        else return valor;


    }
}