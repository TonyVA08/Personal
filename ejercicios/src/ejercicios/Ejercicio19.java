package ejercicios;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,cifra1,cifra2,cifra3,cifra4,cifra5,resto;
        
        System.out.println("Introduce un número de 5 cifras: "); 
        numero=teclado.nextInt();
        //87326: cifra5 es 8 cifra4 es 7 etc
        
        cifra5=numero/10000; // 87326/10000=8 
        resto=numero%10000; // =7326
        cifra4=resto/1000; // 7326/1000=7
        resto=resto%1000;  // 326
        cifra3=resto/100;  // 326/100=3
        resto=resto%100;  //26
        cifra2=resto/10;  //26/10 =2
        cifra1=resto%10; //       6
        
        cifra5=numero/10000;
        cifra4=numero%10000/1000;
        cifra3=numero%1000/100;
        cifra2=numero%100/10; //87326%100=26
        cifra1=numero%10;
        
        
        System.out.println("El número "+numero+" se descompone en:");
        System.out.println("Cifra 5:"+cifra5);
        System.out.println("Cifra 4:"+cifra4);
        System.out.println("Cifra 3:"+cifra3);
        System.out.println("Cifra 2:"+cifra2);
        System.out.println("Cifra 1:"+cifra1);
        
        
        
    }
}
