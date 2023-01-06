package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog5{
    public static void main(String[] args){
        int n = 10;
        try{
            n = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            log.info("Ingrese calificaciones");
            return;
        }
        grade(n);
    }
    // Cálculo de puntuación
    private static void grade(int n){
        if(n>100 || n<0)
            log.info("Entrada inválida");
        else{
            String str = (n>=90)?" Los puntos pertenecen a A, etc.":((n>60)?" Los puntos pertenecen a B, etc.":" Puntos, pertenecen a C, etc.");
            log.info(n+str);
        }
    }
}
