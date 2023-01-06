package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog16{
    public static void main(String[] args){
        for(int i=1;i<10;i++){
            for(int j=1;j<i+1;j++)
                log.info(j+"*"+i+"="+(j*i)+" ");
            log.info("");
        }
    }
}