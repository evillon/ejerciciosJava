package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
 public class Prog3{
    public static void main(String[] args){
        for(int i=100;i<1000;i++){
            if(isLotus(i))
                log.info(i+" ");
        }
        log.info("");
    }
    // Juzgando el número de narcisos
    private static boolean isLotus(int lotus){
        int m = 0;
        int n = lotus;
        int sum = 0;
        m = n/100;
        n  -= m*100;
        sum = m*m*m;
        m = n/10;
        n -= m*10;
        sum += m*m*m + n*n*n;
        return sum == lotus;
    }
}