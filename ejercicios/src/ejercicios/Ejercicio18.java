package ejercicios;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int hac,temp,sum;
        
        System.out.print("Hora actual:");
        hac=teclado.nextInt();
        System.out.print("Cantidad de horas:");
        temp=teclado.nextInt();
        
        //%24  0-23  72%24=0 
        //%8  0-7
        sum=(hac+temp)%24;
        //8%24=8
        //25%24=1
        //Hora actual 5+ avanzo 25=30  %24 son las 6    
        System.out.println("En "+temp+
                           " horas el reloj marcará "+sum);
        
        
        
    }
}
