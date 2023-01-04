import java.util.ArrayList;
public class Prog18{
    String a,b,c;// Un miembro del Equipo A
    public static void main(String[] args){
        String[] racer = {"x","y","z"};// Miembro del equipo B
        ArrayList<Prog18> arrayList = new ArrayList<Prog18>();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                for(int k=0;k<3;k++){
                    Prog18 prog18 = new Prog18(racer[i],racer[j],racer[k]);
                    if(!prog18.a.equals(prog18.b) && !prog18.a.equals(prog18.c) && !prog18.b.equals(prog18.c) &&
                            !prog18.a.equals("x") && !prog18.c.equals("x") && !prog18.c.equals("z"))
                        arrayList.add(prog18);
                }
        for(Object obj:arrayList)
            System.out.println(obj);
    }
    //Método de construcción
    private Prog18(String a,String b,String c){
        this.a = a;
        this.b = b ;
        this.c = c;
    }
    public String toString(){
        return "El oponente de A es "+a+"  "+"el oponente de b es "+b+"  "+"el oponente de c es "+c;
    }
}