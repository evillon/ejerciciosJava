/*
(1) Primero mueva a hacia la derecha4Poco.
(2) Establecer un mínimo4Un poco todo1, El resto son todos0El número. Disponible ~ (~0<<4)
(3) Realice una operación en los dos anteriores.
*/

import java.util.Scanner;
public class Prog32{
    public static void main(String[] msg){
        // Ingresa un entero largo
        System.out.print("Ingresa un entero largo: ");
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        scan.close();
        // Los siguientes personajes de interceptación
        String str = Long.toString(l);
        char[] ch = str.toCharArray();
        int n = ch.length;
        if(n<7)
            System.out.println("¡El número ingresado tiene menos de 7 dígitos!");
        else
            System.out.println("4 ~ 7 dígitos interceptados:"+ch[n-7]+ch[n-6]+ch[n-5]+ch[n-4]);
    }
}