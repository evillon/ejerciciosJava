package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog9{
    public static void main(String[] args){
        int n = 10000;
        compNumber(n);
    }
    // Encuentra el número
    private static void compNumber(int n){
        int count = 0;
        log.info(count);
        log.info(n+" Número completo dentro de:");
        for (int i = 1; i <= 10000; i++) {
            int temp = 0;// Definir la variable de suma de factores
            for (int j = 1; j < i / 2 + 1; j++) {
                if (i % n == 0) {
                    temp += n;// El divisor divisible se agrega a temp
                }
            }
            if (temp == i) {// Si la suma de los factores es igual al número original, significa que el número está completo
                log.info(i + " ");// generar el número
            }
        }
    }
}
