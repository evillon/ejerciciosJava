package com.vilycorp.ejerciosjava.programas;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Prog49{
    public static void main(String[] args){
        String str = "I come from County DingYuan Province AnHui.";
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' ')
                count++;
        }
        count++;
        log.info("Compartido "+count+" Instrumentos de cuerda");
    }
}
