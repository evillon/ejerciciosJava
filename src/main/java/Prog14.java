import java.util.Scanner;
public class Prog14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\\D");// Coincidir sin dígitos
        System.out.print("Introduzca la fecha actual (año-mes-día):");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int date = scan.nextInt();
        scan.close();
        System.out.println("Hoy es "+year+" El primero del año "+analysis(year,month,date)+" día");
    }
    // Juzgando el número de días
    private static int analysis(int year, int month, int date){
        int n = 0;
        int[] month_date = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
        if((year%400)==0 || ((year%4)==0)&&((year%100)!=0))
            month_date[2] = 29;
        for(int i=0;i<month;i++)
            n += month_date[i];
        return n+date;
    }
}
