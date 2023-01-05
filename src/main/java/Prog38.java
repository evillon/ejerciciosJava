import java.util.Scanner;
public class Prog38{
    public static void main(String[] args){
        System.out.print("Ingrese una cadena de caracteres:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        String strIn = scan.next();
        scan.close();
        char[] ch = strIn.toCharArray();
        System.out.println(strIn+" Común "+(ch.length-1)+" Caracteres");
    }
}