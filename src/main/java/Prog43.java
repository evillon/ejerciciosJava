public class Prog43{
    public static void main(String[] args){
        int count = 0;
        // Declara un número compuesto por números
        int n = 8;
        //Un dígito
        count = n/2;
        // Dos dígitos
        count += (n-1)*n/2;
        // Tres dígitos
        count += (n-1)*n*n/2;
        //Cuatro dígitos
        count += (n-1)*n*n*n/2;
        // Cinco dígitos
        count += (n-1)*n*n*n*n/2;
        // Seis dígitos
        count += (n-1)*n*n*n*n*n/2;
        // Siete dígitos
        count += (n-1)*n*n*n*n*n*n/2;
        System.out.println("El número impar de 0 a 7 se puede componer:"+count);
    }
}