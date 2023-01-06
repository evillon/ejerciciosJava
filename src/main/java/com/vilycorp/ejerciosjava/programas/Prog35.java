package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog35{
    public static void main(String[] args){
        log.info("Ingrese un conjunto de números:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int[] a = new int[50];
        int m = 0;
        while(scan.hasNextInt()){
            a[m++] = scan.nextInt();
        }
        scan.close();
        int[] b = new int[m];
        System.arraycopy(a, 0, b, 0, m);
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b.length-i-1;j++)
                if(b[j]<b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
        for (int j : b) log.info(j + " ");

    }
}