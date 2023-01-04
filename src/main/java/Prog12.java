import java.io.*;
public class Prog12{
    public static void main(String[] args){
        System.out.print("Ingrese el beneficio actual:");
        long profit = Long.parseLong(key_Input());
        System.out.println("Bonificación a pagar:"+bonus(profit));
    }
    // Acepta la entrada del teclado
    private static String key_Input(){
        String str = null;
        BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in));
        try{
            str = bufIn.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                bufIn.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return str;
    }
    // Calcular bonificación
    private static long bonus(long profit){
        long prize = 0;
        long profit_sub = profit;
        if(profit>1000000){
            profit = profit_sub-1000000;
            profit_sub = 1000000;
            prize += profit*0.01;
        }
        if(profit>600000){
            profit = profit_sub-600000;
            profit_sub = 600000;
            prize += profit*0.015;
        }
        if(profit>400000){
            profit = profit_sub-400000;
            profit_sub = 400000;
            prize += profit*0.03;
        }
        if(profit>200000){
            profit = profit_sub-200000;
            profit_sub = 200000;
            prize += prize*0.05;
        }
        if(profit>100000){
            profit = profit_sub-100000;
            profit_sub = 100000;
            prize += profit*0.075;
        }
        prize += profit_sub*0.1;
        return prize;
    }
}