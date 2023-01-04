public class Prog5{
    public static void main(String[] args){
        int n = 10;
        try{
            n = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ingrese calificaciones");
            return;
        }
        grade(n);
    }
    // Cálculo de puntuación
    private static void grade(int n){
        if(n>100 || n<0)
            System.out.println("Entrada inválida");
        else{
            String str = (n>=90)?" Los puntos pertenecen a A, etc.":((n>60)?" Los puntos pertenecen a B, etc.":" Puntos, pertenecen a C, etc.");
            System.out.println(n+str);
        }
    }
}
