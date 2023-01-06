package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog33{
    public static void main(String[] args){
        int[][] n = new int[10][21];
        n[0][10] = 1;
        for(int i=1;i<10;i++)
            for(int j=10-i;j<10+i+1;j++)
                n[i][j] = n[i-1][j-1]+n[i-1][j+1];
        for(int i=0;i<10;i++){
            for(int j=0;j<21;j++){
                if(n[i][j]==0)
                    log.info("   ");
                else{
                    if(n[i][j]<10)
                        log.info("  "+n[i][j]);// Se necesita espacio para la belleza
                    else if(n[i][j]<100)
                        log.info(" "+n[i][j]);
                    else
                        log.info(n[i][j]);
                }
            }
            log.info("");
        }
    }
}
