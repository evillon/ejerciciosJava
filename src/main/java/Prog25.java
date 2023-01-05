import java.io.*;
public class Prog25{
    public static void main(String[] args){
        int n = 0;
        System.out.print("Ingrese un número de 5 dígitos:");
        BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in));
        try{
            n = Integer.parseInt(bufin.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                bufin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        palin(n);
    }
    private static void palin(int n){
        int m = n;
        int[] a = new int[5];
        if(n<10000 || n>99999){
            System.out.println("¡La entrada no es de 5 dígitos!");
            return;
        }else{
            for(int i=0;i<5;i++){
                a[i] = n%10;
                n /= 10;
            }
            if(a[0]==a[4] && a[1]==a[3])
                System.out.println(m+"Es un palíndromo");
            else
                System.out.println(m+"No es un palíndromo");
        }
    }
}
