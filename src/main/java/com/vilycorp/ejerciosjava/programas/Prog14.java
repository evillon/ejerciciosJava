package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Prog14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");// Coincidir sin dígitos
        log.info("Introduzca la fecha actual (año-mes-día):");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();
        scan.close();
        log.info("Hoy es "+year+" El primero del año "+analysis(year,month,date)+" día");
    }
    // Juzgando el número de días
    private static int analysis(int year, int month, int date){
        int n = 0;
        int[] monthDate = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
        if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
            monthDate[2] = 29;
        for(int i=0;i<month;i++)
            n += monthDate[i];
        return n+date;
    }
}
