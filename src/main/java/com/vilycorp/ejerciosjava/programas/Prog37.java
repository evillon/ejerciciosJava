package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog37{
    public static void main(String[] args){
        log.info("Introduzca un número entero:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        // Defina una variable de matriz para identificar si alguien todavía está en el círculo
        boolean[] isIn = new boolean[n];
        for(int i=0;i<isIn.length;i++)
            isIn[i] = true;
        // Defina el número de personas en el círculo, el número de informes y el índice
        int inCount = n;
        int countNum = 0;
        int index = 0;
        while(inCount>1){
            if(isIn[index]){
                countNum++;
                if(countNum==3){
                    countNum = 0;
                    isIn[index] = false;
                    inCount--;
                }
            }
            index++;
            if(index==n)
                index = 0;
        }
        for(int i=0;i<n;i++)
            if(isIn[i])
                log.info("Lo que queda es:"+(i+1));
    }
}