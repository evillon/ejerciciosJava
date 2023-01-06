package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog39{
    public static void main(String[] args){
        log.info("Introduzca un número entero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if(n%2==0)
            log.info("resultado:"+even(n));
        else
            log.info("resultado:"+odd(n));
    }
    //número impar
    static double odd(int n){
        double sum = 0;
        for(int i=1;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
    //incluso
    static double even(int n){
        double sum = 0;
        for(int i=2;i<n+1;i+=2){
            sum += 1.0/i;
        }
        return sum;
    }
}