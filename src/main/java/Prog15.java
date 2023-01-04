import java.util.Scanner;
public class Prog15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");
        System.out.print("Ingrese tres números:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        System.out.println("Ordenar resultados:"+sort(x,y,z));
    }
    // Compara el tamaño de dos números
    private static String sort(int x,int y,int z){
        String s = null;
        if(x>y){
            int t = x;
            x = y;
            y = t;
        }
        if(x>z){
            int t = x;
            x = z;
            z = t;
        }
        if(y>z){
            int t = z;
            z = y;
            y = t;
        }
        s = x+" "+y+" "+z;
        return s;
    }
}