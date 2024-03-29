package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog40{
    public static void main(String[] args){
        String[] str = {"abc","cad","m","fa","f"};
        for(int i=str.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(str[j].compareTo(str[j+1])<0){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for(String subStr:str)
            log.info(subStr+" ");
    }
}