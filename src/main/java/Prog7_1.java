import java.util.Scanner;
public class Prog7_1{
    public static void main(String[] args){
        System.out.print("Ingrese una cadena de caracteres:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();// Convertir una línea de caracteres en una cadena
        scan.close();
        count(str);
    }
    // Cuente el número de caracteres ingresados
    private static void count(String str){
        String E1 = "[\u4e00-\u9fa5]";//Personaje chino
        String E2 = "[a-zA-Z]";
        String E3 = "[0-9]";
        String E4 = "\\s";//Espacio
        int countChinese = 0;
        int countLetter = 0;
        int countNumber = 0;
        int countSpace = 0;
        int countOther = 0;
        char[] array_Char = str.toCharArray();// Convertir una cadena en una matriz de caracteres
        String[] array_String = new String[array_Char.length];// Los caracteres chinos solo se pueden procesar como cadenas
        for(int i=0;i<array_Char.length;i++)
            array_String[i] = String.valueOf(array_Char[i]);
        // Atraviesa los elementos en la matriz de cadenas
        for(String s:array_String){
            if(s.matches(E1))
                countChinese++;
            else if(s.matches(E2))
                countLetter++;
            else if(s.matches(E3))
                countNumber++;
            else if(s.matches(E4))
                countSpace++;
            else
                countOther++;
        }
        System.out.println("Número de caracteres chinos ingresados:"+countChinese);
        System.out.println("Número de letras ingresadas:"+countLetter);
        System.out.println("Número de dígitos ingresados:"+countNumber);
        System.out.println("Número de espacios ingresados:"+countSpace);
        System.out.println("Número de otros caracteres ingresados:"+countSpace);
    }
}
 
