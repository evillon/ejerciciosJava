package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog22{
    public static void main(String[] args){
        log.info(fact(10));
    }
    // Encontrar factorial de forma recursiva
    private static long fact(int n){
        if(n==1)
            return 1;
        else
            return fact(n-1)*n;
    }
}