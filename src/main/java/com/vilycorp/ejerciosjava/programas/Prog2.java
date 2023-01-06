package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
 public class Prog2{
    public static void main(String[] args){
        int m = 1;
        int n = 1000;
        int count = 0;
        // Cuenta el número de números primos
        for(int i=m;i<n;i++){
            if(isPrime(i)){
                count++;
                log.info(completaEspacios(i+" "));
                if(count%10==0){
                    log.info("");
                }
            }
        }
        log.info("");
        log.info("en "+m+" con "+n+" Compartido entre "+count+" Un número primo");
    }
    // Determinar números primos
    private static boolean isPrime(int n){
        boolean flag = true;
        if(n==1)
            flag = false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    private static String completaEspacios(String valor){
        if (valor.length()== 2)
            return " ".concat(" ").concat(valor);
        else if (valor.length() == 3) {
            return " ".concat(valor);
        }
        else return valor;


    }
}