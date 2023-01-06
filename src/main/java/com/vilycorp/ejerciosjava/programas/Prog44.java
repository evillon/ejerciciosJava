package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog44{
    public static void main(String[] args){
        log.info("Ingrese un número par:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2!=0){
            log.info("¡Lo que ingresaste no es un número par!");
            return;
        }
        twoAdd(n);
    }
    // El número par se descompone en la suma de números primos
    private static void twoAdd(int n){
        for(int i=2;i<n/2+1;i++){
            if(isPrime(i)&&isPrime(n-i)){
                log.info(n+"="+(i)+"+"+(n-i));
                break;
            }
        }
    }
    // Determinar números primos
    private static boolean isPrime(int m){
        boolean flag = true;
        for(int i=2;i<Math.sqrt(m)+1;i++){
            if(m%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}