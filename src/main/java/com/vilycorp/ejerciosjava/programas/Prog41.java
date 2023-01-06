package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog41{
    public static void main(String[] args){
        int n;
        n = fun(0);
        log.info("Entonces alli esta "+n+" Un melocotón");
    }
    private static int fun(int i){
        if(i==5)
            return 1;
        else
            return fun(i+1)*5+1;
    }
}