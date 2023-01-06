package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.io.*;
@Log4j2
public class Prog25{
    public static void main(String[] args){
        int n = 0;
        log.info("Ingrese un número de 5 dígitos:");

        try(BufferedReader bufin = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(bufin.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
        palin(n);
    }
    private static void palin(int n){
        int m = n;
        int[] a = new int[5];
        if(n<10000 || n>99999){
            log.info("¡La entrada no es de 5 dígitos!");
        }else{
            for(int i=0;i<5;i++){
                a[i] = n%10;
                n /= 10;
            }
            if(a[0]==a[4] && a[1]==a[3])
                log.info(m+"Es un palíndromo");
            else
                log.info(m+"No es un palíndromo");
        }
    }
}
