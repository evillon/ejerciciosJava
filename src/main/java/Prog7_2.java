import java.util.*;
public class Prog7_2{
    public static void main(String[] args){
        System.out.println("Ingrese una línea de caracteres:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        count(str);
    }
    // Estadísticas introducidas caracteres
    private static void count(String str){
        List<String> list = new ArrayList<String>();
        char[] array_Char = str.toCharArray();
        for(char c:array_Char)
            list.add(String.valueOf(c));// Agrega el carácter como una cadena a la tabla de lista
        Collections.sort(list);//Ordenar
        for(String s:list){
            int begin = list.indexOf(s);
            int end = list.lastIndexOf(s);
            // El número de caracteres al final del índice
            if(list.get(end)==s)
                System.out.println("personaje'"+s+"'Tener"+(end-begin+1)+"UNA");
        }
    }
}