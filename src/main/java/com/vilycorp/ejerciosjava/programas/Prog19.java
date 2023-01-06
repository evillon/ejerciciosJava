package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog19{
    public static void main(String[] args){
        int n = 5;
        printStar(n);
    }
    // Imprimir estrellas
    private static void printStar(int n){
        // Imprime la parte superior
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<n-i)
                    log.info(" ");
                if(j>=n-i && j<=n+i)
                    log.info("*");
            }
            log.info("");
        }
        // Imprime la parte inferior
        for(int i=1;i<n;i++){
            log.info(" ");
            for(int j=0;j<2*n-i;j++){
                if(j<i)
                    log.info(" ");
                if(j>=i && j<2*n-i-1)
                    log.info("*");
            }
            log.info("");
        }
    }
}