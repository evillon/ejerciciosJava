package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog34{
    public static void main(String[] args){
        log.info("Ingrese 3 números:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        if(a<b){
            int t = a;
            a = b;
            b = t;
        }
        if(a<c){
            int t = a;
            a = c;
            c = t;
        }
        if(b<c){
            int t = b;
            b = c;
            c = t;
        }
        log.info(a+" "+b+" "+c);
    }
}
