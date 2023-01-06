package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog17{
    public static void main(String[] args){
        int m = 1;
        for(int i=10;i>0;i--)
            m = 2*m + 2;
        log.info("Todos los monitos recogidos "+m+" melocotón");
    }
}