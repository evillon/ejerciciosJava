package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Prog8{
    public static void main(String[] args){
        log.info("Para el valor de s = a + aa + aaa + aaaa + ..., ingrese el valor de a:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s*");// Usa el espacio como separador
        int a = scan.nextInt();
        log.info(a);
        int n = scan.nextInt();
        log.info(n);
        scan.close();// Cerrar el escáner
        log.info(expressed(a,n)+add(a,n));
    }
    // Expresión de suma
    private static String expressed(int a,int n){
        StringBuilder sb = new StringBuilder();
        StringBuilder subSB = new StringBuilder();
        for(int i=1;i<n+1;i++){
            subSB.append(a);
            sb.append(subSB);
            if(i<n) {
                sb.append("+");
            }
        }
        sb.append("=");
        return sb.toString();
    }
    //Suma
    private static long add(int a,int n){
        long sum = 0;
        long subSUM = 0;
        for(int i=1;i<n+1;i++){
            subSUM = subSUM*10+a;
            sum = sum+subSUM;
        }
        return sum;
    }
}
