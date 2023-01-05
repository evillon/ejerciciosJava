import java.util.Scanner;

import java.util.*;

import static java.lang.System.out;

public class Prog7 {

    public static void main(String[] args){
        Prog7A.main(args);
    }

    public static class Prog7A {
        public static void main(String[] args) {
            out.println("Ingrese una cadena de caracteres:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();// Convertir una línea de caracteres en una cadena
            scan.close();
            count(str);
        }

        // Cuente el número de caracteres ingresados
        private static void count(String str) {
            String e1 = "[\u4e00-\u9fa5]";//Personaje chino
            String e2 = "[a-zA-Z]";
            String e3 = "\\d";
            String e4 = "\\s";//Espacio
            int countChinese = 0;
            int countLetter = 0;
            int countNumber = 0;
            int countSpace = 0;
            char[] arrayChar = str.toCharArray();// Convertir una cadena en una matriz de caracteres
            String[] arrayString = new String[arrayChar.length];// Los caracteres chinos solo se pueden procesar como cadenas
            for (int i = 0; i < arrayChar.length; i++)
                arrayString[i] = String.valueOf(arrayChar[i]);
            // Atraviesa los elementos en la matriz de cadenas
            for (String s : arrayString) {
                if (s.matches(e1))
                    countChinese++;
                else if (s.matches(e2))
                    countLetter++;
                else if (s.matches(e3))
                    countNumber++;
                else if (s.matches(e4))
                    countSpace++;
                else
                    ;
            }
            out.println("Número de caracteres chinos ingresados:" + countChinese);
            out.println("Número de letras ingresadas:" + countLetter);
            out.println("Número de dígitos ingresados:" + countNumber);
            out.println("Número de espacios ingresados:" + countSpace);
            out.println("Número de otros caracteres ingresados:" + countSpace);
        }
    }


    public static class Prog7B {
        public static void main(String[] args) {
            out.println("Ingrese una línea de caracteres:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            scan.close();
            count(str);
        }

        // Estadísticas introducidas caracteres
        private static void count(String str) {
            List<String> list = new ArrayList<>();
            char[] arrayChar = str.toCharArray();
            for (char c : arrayChar)
                list.add(String.valueOf(c));// Agrega el carácter como una cadena a la tabla de lista
            Collections.sort(list);//Ordenar
            for (String s : list) {
                int begin = list.indexOf(s);
                int end = list.lastIndexOf(s);
                // El número de caracteres al final del índice
                if (Objects.equals(list.get(end), s))
                    out.println("personaje'" + s + "'Tener" + (end - begin + 1) + "UNA");
            }
        }
    }
}