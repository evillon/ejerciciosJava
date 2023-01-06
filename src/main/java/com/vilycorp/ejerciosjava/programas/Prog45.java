package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog45{
    public static void main(String[] args){
        log.info("Por favor, introduzca un número:");
        Scanner scan = new Scanner(System.in);
        long l = scan.nextLong();
        long n = l;
        scan.close();
        int count = 0;
        while(n>8){
            n /= 9;
            count++;
        }
        log.info(l+" Puede ser "+count+" Divisible por 9.");
    }
}