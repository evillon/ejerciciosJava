package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog47{
    public static void main(String[] args){
        log.info("Por favor ingrese 7 enteros (1-50):");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        int n7 = scan.nextInt();
        scan.close();
        printStar(n1);
        printStar(n2);
        printStar(n3);
        printStar(n4);
        printStar(n5);
        printStar(n6);
        printStar(n7);
    }
    static void printStar(int m){
        log.info(m);
        for(int i=0;i<m;i++)
            log.info("*");
        log.info("");
    }
}