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
        System.out.println("Compartido "+count+" Instrumentos de cuerda");
    }
}
