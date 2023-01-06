package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog36{
    public static void main(String[] args){
        final int N = 10;
        log.info("Ingrese una matriz de 10 números:");
        Scanner scan = new Scanner(System.in);
        int[] a = new int[N];
        for(int i=0;i<a.length;i++)
            a[i] = scan.nextInt();
        log.info("Introduzca un número menor que 10:");
        int m = scan.nextInt();
        scan.close();
        int[] b = new int[m];
        int[] c = new int[N-m];
        System.arraycopy(a, 0, b, 0, m);
        for(int i=m,j=0;i<N;i++,j++)
            c[j] = a[i];
        System.arraycopy(c, 0, a, 0, N - m);
        for(int i=N-m,j=0;i<N;i++,j++)
            a[i] = b[j];
        for (int j : a) log.info(j + " ");
    }
}