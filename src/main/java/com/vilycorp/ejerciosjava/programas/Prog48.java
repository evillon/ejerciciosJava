package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog48{
    public static void main(String[] args){
        int n = 1234;
        int[] a = new int[4];
        for(int i=3;i>=0;i--){
            a[i] = n%10;
            n /= 10;
        }
        for(int i=0;i<4;i++)
            log.info(a[i]);
        log.info("");
        for(int i=0;i<a.length;i++){
            a[i] += 5;
            a[i] %= 10;
        }
        int temp1 = a[0];
        a[0] = a[3];
        a[3] = temp1;
        int temp2 = a[1];
        a[1] = a[2];
        a[2] = temp2;
        for(int i=0;i<a.length;i++)
            log.info(a[i]);
    }
}