package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog30{
    public static void main(String[] args){
        int[] ma = new int[]{0,8,7,5,9,1,2,4,3,12};
        int[] mb = sort(ma);
        print(mb);
        log.info("");
        log.info("Ingrese una matriz de 10 números:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int[] mc = insert(a,mb);
        print(mc);
    }
    // Seleccionar ordenar
    private static int[] sort(int[] ma){
        int[] mb = new int[ma.length];
        for(int i=0;i<ma.length-1;i++){
            int min = ma[i];
            for(int j=i+1;j<ma.length;j++){
                if(min>ma[j]){
                    int temp = min;
                    min = ma[j];
                    ma[j] = temp;
                }
                mb[i] = min;
            }
        }
        mb[ma.length-1] = ma[ma.length-1];
        return mb;
    }
    //impresión
    private static void print(int[] ma){
        for (int j : ma) log.info(j + " ");
    }
    // Insertar números
    private static int[] insert(int a,int[] ma){
        int[] mb = new int[ma.length+1];
        for(int i=ma.length-1;i>0;i--)
            if(a>ma[i]){
                mb[i+1] = a;
                System.arraycopy(ma, 0, mb, 0, i + 1);
                if (mb.length - (i + 2) >= 0) System.arraycopy(ma, i + 2 - 1, mb, i + 2, mb.length - (i + 2));
                break;
            }
        return mb;
    }
}