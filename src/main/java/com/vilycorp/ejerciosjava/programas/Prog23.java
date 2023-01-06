package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog23{
    public static void main(String[] args){
        log.info(getAge(5,2));
    }
    // Encuentra la edad del compañero mes
    private static int getAge(int m,int n){
        if(m==1)
            return 10;
        else
            return getAge(m-1,n)+n;
    }
}
