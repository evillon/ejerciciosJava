package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Prog10{
    public static void main(String[] args){
        log.info("Por favor ingrese la altura de la pelota cuando aterrizó y el número de soluciones:");
        Scanner scan = new Scanner(System.in).useDelimiter("\\s");
        int h = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        distance(h,n);
    }

    // La pelota cae desde la altura h, la distancia pasada y la altura del rebote después de n rebotes
    private static void distance(double h,int n){
        double length = 0;
        for(int i=0;i<n;i++){
            length += h;
            h *=0.5 ;
            length += h;
        }
        log.info("Después del primero "+n+" Tras el rebote, el balón pasó "+length+" Metro,"+" "+n+" La segunda altura de rebote es "+h+" Metro");
    }
}