package javaapplication1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int niños,niñas,suma;
        double div1,div2;
        
        System.out.print("Dime cuantos niños");
        niños=teclado.nextInt();
        System.out.print("Dime cuantas niñas");
        niñas=teclado.nextInt();
        
        suma=niños+niñas;
        div1=(double)niños/suma*100;
        div2=(double)niñas/suma*100;
        
        System.out.println("Porcentaje de niños:"+div1+"%");
        System.out.println("Porcentaje de niñas:"+div2+"%");
    }
            
    
    
}
