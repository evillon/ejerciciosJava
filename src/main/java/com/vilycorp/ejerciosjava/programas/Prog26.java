package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.io.*;
@Log4j2
public class Prog26{
    public static void main(String[] args){
        String str = "";
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
        log.info("Ingrese las primeras dos a cuatro letras de la palabra en inglés de la semana):");
        try{
            str = bufIn.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                bufIn.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        week(str);
    }
    private static void week(String str){
        int n = -1;
        if(str.trim().equalsIgnoreCase("Mo") || str.trim().equalsIgnoreCase("Mon") || str.trim().equalsIgnoreCase("Mond"))
            n = 1;
        if(str.trim().equalsIgnoreCase("Tu") || str.trim().equalsIgnoreCase("Tue") || str.trim().equalsIgnoreCase("Tues"))
            n = 2;
        if(str.trim().equalsIgnoreCase("We") || str.trim().equalsIgnoreCase("Wed") || str.trim().equalsIgnoreCase("Wedn"))
            n = 3;
        if(str.trim().equalsIgnoreCase("Th") || str.trim().equalsIgnoreCase("Thu") || str.trim().equalsIgnoreCase("Thur"))
            n = 4;
        if(str.trim().equalsIgnoreCase("Fr") || str.trim().equalsIgnoreCase("Fri") || str.trim().equalsIgnoreCase("Frid"))
            n = 5;
        if(str.trim().equalsIgnoreCase("Sa") || str.trim().equalsIgnoreCase("Sat") || str.trim().equalsIgnoreCase("Satu"))
            n = 6;
        if(str.trim().equalsIgnoreCase("Su") || str.trim().equalsIgnoreCase("Sun") || str.trim().equalsIgnoreCase("Sund"))
            n = 0;
        switch(n){
            case 1:
                log.info("Lunes");
                break;
            case 2:
                log.info("Martes");
                break;
            case 3:
                log.info("Miércoles");
                break;
            case 4:
                log.info("Jueves");
                break;
            case 5:
                log.info("Viernes");
                break;
            case 6:
                log.info("en sábado");
                break;
            case 0:
                log.info("el domingo");
                break;
            default:
                log.info("¡Error de entrada!");
                break;
        }
    }
}
