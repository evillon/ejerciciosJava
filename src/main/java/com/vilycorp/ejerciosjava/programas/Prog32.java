package com.vilycorp.ejerciosjava.programas;/*
(1) Primero mueva a hacia la derecha4Poco.
(2) Establecer un mínimo4Un poco , El resto son todos0El número. Disponible ~ (~0<<4)
(3) Realice una operación en los dos anteriores.
*/

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog32{
    public static void main(String[] msg){
        // Ingresa un entero largo
        log.info("Ingresa un entero largo: ");
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        scan.close();
        // Los siguientes personajes de interceptación
        String str = Long.toString(l);
        char[] ch = str.toCharArray();
        int n = ch.length;
        if(n<7)
            log.info("¡El número ingresado tiene menos de 7 dígitos!");
        else
            log.info("4 ~ 7 dígitos interceptados:"+ch[n-7]+ch[n-6]+ch[n-5]+ch[n-4]);
    }
}