package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.io.*;
@Log4j2
public class Prog12{
    public static void main(String[] args){
        log.info("Ingrese el beneficio actual:");
        long profit = Long.parseLong(keyInput());
        log.info("Bonificación a pagar:"+bonus(profit));
    }
    // Acepta la entrada del teclado
    private static String keyInput(){
        String str = null;

        try(BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in))){
            str = bufIn.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
    // Calcular bonificación
    private static long bonus(long profit){
        long prize = 0;
        long profitSub = profit;
        if(profit>1000000){
            profit = profitSub-1000000;
            profitSub = 1000000;
            prize += profit*0.01;
        }
        if(profit>600000){
            profit = profitSub-600000;
            profitSub = 600000;
            prize += profit*0.015;
        }
        if(profit>400000){
            profit = profitSub-400000;
            profitSub = 400000;
            prize += profit*0.03;
        }
        if(profit>200000){
            profit = profitSub-200000;
            profitSub = 200000;
            prize += prize*0.05;
        }
        if(profit>100000){
            profit = profitSub-100000;
            profitSub = 100000;
            prize += profit*0.075;
        }
        prize += profitSub*0.1;
        return prize;
    }
}