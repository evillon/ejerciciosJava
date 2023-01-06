package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;
import java.util.Scanner;
import java.util.*;

@Log4j2
public class Prog7 {

    public static void main(String[] args){
        Prog7A.main(args);
        Prog7B.main(args);
    }

    public static class Prog7A {
        public static void main(String[] args) {
            log.info("Ingrese una cadena de caracteres:");
            Scanner scan = new Scanner(System.in).useDelimiter("\\s*");
            String str = scan.nextLine();// Convertir una línea de caracteres en una cadena
            scan.close();
            count(str);
        }

        // Cuente el número de caracteres ingresados
        private static void count(String str) {
            String e1 = "[一-龥]";//Personaje chino
            String e2 = "[a-zA-Z]";
            String e3 = "\\d";
            String e4 = "\\s";//Espacio
            int countChinese = 0;
            int countLetter = 0;
            int countNumber = 0;
            int countSpace = 0;
            int countOther = 0;
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
                    countOther++;
            }
            log.info("Número de caracteres chinos ingresados:" + countChinese);
            log.info("Número de letras ingresadas:" + countLetter);
            log.info("Número de dígitos ingresados:" + countNumber);
            log.info("Número de espacios ingresados:" + countSpace);
            log.info("Número de otros caracteres ingresados:" + countOther);
        }
    }


    public static class Prog7B {
        public static void main(String[] args) {
            log.info("Ingrese una línea de caracteres:");
            Scanner scan = new Scanner(System.in).useDelimiter("\\s*");
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
                    log.info("personaje'" + s + "'Tener" + (end - begin + 1) + "UNA");
            }
        }
    }
}