import java.util.Scanner;

import java.util.*;
public class Prog7 {

    public static void main(String[] args){
        Prog7_1.main(args);
        System.out.println("");
        //Prog7_2.main(args);
    }

    public static class Prog7_1 {
        public static void main(String[] args) {
            System.out.println("Ingrese una cadena de caracteres:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();// Convertir una línea de caracteres en una cadena
            scan.close();
            count(str);
        }

        // Cuente el número de caracteres ingresados
        private static void count(String str) {
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
            for (int i = 0; i < array_Char.length; i++)
                array_String[i] = String.valueOf(array_Char[i]);
            // Atraviesa los elementos en la matriz de cadenas
            for (String s : array_String) {
                if (s.matches(E1))
                    countChinese++;
                else if (s.matches(E2))
                    countLetter++;
                else if (s.matches(E3))
                    countNumber++;
                else if (s.matches(E4))
                    countSpace++;
                else
                    countOther++;
            }
            System.out.println("Número de caracteres chinos ingresados:" + countChinese);
            System.out.println("Número de letras ingresadas:" + countLetter);
            System.out.println("Número de dígitos ingresados:" + countNumber);
            System.out.println("Número de espacios ingresados:" + countSpace);
            System.out.println("Número de otros caracteres ingresados:" + countSpace);
        }
    }


    public static class Prog7_2 {
        public static void main(String[] args) {
            System.out.println("Ingrese una línea de caracteres:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            scan.close();
            count(str);
        }

        // Estadísticas introducidas caracteres
        private static void count(String str) {
            List<String> list = new ArrayList<>();
            char[] array_Char = str.toCharArray();
            for (char c : array_Char)
                list.add(String.valueOf(c));// Agrega el carácter como una cadena a la tabla de lista
            Collections.sort(list);//Ordenar
            for (String s : list) {
                int begin = list.indexOf(s);
                int end = list.lastIndexOf(s);
                // El número de caracteres al final del índice
                if (list.get(end) == s)
                    System.out.println("personaje'" + s + "'Tener" + (end - begin + 1) + "UNA");
            }
        }
    }
}