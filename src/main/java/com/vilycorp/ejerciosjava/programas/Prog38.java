package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog38{
    public static void main(String[] args){
        log.info("Ingrese una cadena de caracteres:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\n");
        String strIn = scan.next();
        scan.close();
        char[] ch = strIn.toCharArray();
        log.info(strIn+" Común "+(ch.length-1)+" Caracteres");
    }
}