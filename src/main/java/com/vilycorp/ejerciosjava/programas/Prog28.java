package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog28{
    public static void main(String[] args){
        int[] a = new int[]{31,42,21,50,12,60,81,74,101,93};
        for(int i=0;i<10;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            log.info(a[i]+" ");
        }
    }
}