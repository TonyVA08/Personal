package ejercicios;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int importe,uno,dos,cinco,diez,veinte;
        
        System.out.print("Importe a devolver: ");
        importe=teclado.nextInt();
//        veinte=importe/20;  // 353/20=17  20*17=340 
//        importe=importe%20;  //13 
//        diez=importe/10;   //13/10=1  
//        importe=importe%10; //3
//        cinco=importe/5;    // 3/5=0
//        importe=importe%5;  // 3
//        dos=importe/2;  // 3/2=1
//        uno=importe%2;  // 1
        
        veinte=importe/20;
        diez=importe%20/10;
        cinco=importe%20%10/5;
        dos=importe%20%10%5/2;
        uno=importe%20%10%5%2;
                
        System.out.println("Importe a devolver:"+importe);
        System.out.println("Billetes de 20€:"+veinte);
        System.out.println("Billetes de 10€:"+diez);
        System.out.println("Billetes de 5€:"+cinco);
        System.out.println("Monedas de 2€:"+dos);
        System.out.println("Monedas de 1€:"+uno);
        
        
        
    }
}
