package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog31{
    public static void main(String[] args){
        int[] ma = new int[]{1,2,3,4,5,6,7,8,9,};
        print(ma);
        log.info("");
        int[] mb = reverse(ma);
        print(mb);
    }
    private static int[] reverse(int[] ma){
        for(int i=0;i<ma.length/2;i++){
            int temp = ma[ma.length-i-1];
            ma[ma.length-i-1] = ma[i];
            ma[i] = temp;
        }
        return ma;
    }
    private static void print(int[] ma){
        for (int j : ma) log.info(j + " ");
    }
}