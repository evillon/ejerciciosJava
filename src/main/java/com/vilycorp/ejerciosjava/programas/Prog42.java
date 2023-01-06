package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog42{
    public static void main(String[] args){
        int n = 0;
        boolean flag = false;
        for(int i=10;i<100;i++)
            if(809*i==800*i+9*i+1){
                flag = true;
                n = i;
                break;
            }
        if(flag)
            log.info(n);
        else
            log.info("¡Ningún número cumple con los requisitos!");
    }
}