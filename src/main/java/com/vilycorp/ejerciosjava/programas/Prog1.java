package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;
import java.util.Scanner;


@Log4j2
public class Prog1{
    public static void main(String[] args){
    
        log.info("Ingrese numero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n > 30) {
            log.info("No puede ingresar un numero mayor a 30");
            return;
        }
        log.info(" "+n+" El número total de conejos por mes es "+fun(n));
    }
    private static int fun(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}