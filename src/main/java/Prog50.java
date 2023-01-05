import java.io.*;
public class Prog50{
    // Definir modelo de estudiante
    String[] number = new String[5];
    String[] name = new String[5];
    float[][] grade = new float[5][3];
    float[] sum = new float[5];
    public static void main(String[] args) throws Exception{
        Prog50 stud = new Prog50();
        stud.input();
        stud.output();
    }
    // Ingrese la identificación del estudiante, nombre, calificaciones
    void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Bandera de estado de entrada
        boolean isRecord = true;
        while(isRecord){
            try{
                for(int i=0;i<2;i++){
                    System.out.print("Por favor ingrese la identificación de estudiante: ");
                    number[i] = br.readLine();
                    System.out.print("Por favor escriba su nombre: ");
                    name[i] = br.readLine();
                    for(int j=0;j<3;j++){
                        System.out.print("Por favor ingrese el primero "+(j+1)+" Puntuación de la clase:");
                        grade[i][j] = Integer.parseInt(br.readLine());
                    }
                    System.out.println();
                    sum[i] = grade[i][0]+grade[i][1]+grade[i][2];
                }

                isRecord = false;
            }catch(NumberFormatException e){
                System.out.println("¡Por favor, introduzca un número!");
            }
        }
    }
    //Archivo de salida
    void output() throws IOException{
        FileWriter fw = new FileWriter("C:/Users/edifi/deaProjects/ejerciciosJava/src/main/resources/stud.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("No.  "+"Name  "+"grade1  "+"grade2  "+"grade3  "+"average");
        bw.newLine();
        for(int i=0;i<2;i++){
            bw.write(number[i]);
            bw.write("  "+name[i]);
            for(int j=0;j<3;j++)
                bw.write("  "+grade[i][j]);
            bw.write("  "+(sum[i]/5));
            bw.newLine();
        }
        bw.close();
    }
}