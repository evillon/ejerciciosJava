public class Prog24{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int[] a = new int[5];
        do{
            a[i] = n%10;
            n /= 10;
            ++i;
        }while(n!=0);
        System.out.print("Esto es un "+i+" El número de dígitos, comenzando desde el lugar de las unidades, los dígitos son:");
        for(int j=0;j<i;j++)
            System.out.print(a[j]+" ");
    }
}
