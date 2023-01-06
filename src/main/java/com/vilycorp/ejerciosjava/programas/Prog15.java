package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");
        log.info("Ingrese tres números:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        log.info("Ordenar resultados:"+sort(x,y,z));
    }
    // Compara el tamaño de dos números
    private static String sort(int x,int y,int z){
        String s = null;
        if(x>y){
            int t = x;
            x = y;
            y = t;
        }
        if(x>z){
            int t = x;
            x = z;
            z = t;
        }
        if(y>z){
            int t = z;
            z = y;
            y = t;
        }
        s = x+" "+y+" "+z;
        return s;
    }
}