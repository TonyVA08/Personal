package intercambio;

import java.util.Scanner;

public class Intercambio {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b,auxiliar;
        System.out.print("Dime un valor para la variable a:");
        a=teclado.nextInt();
        System.out.print("Dime un valor para la variable b:");
        b=teclado.nextInt();
        
        System.out.println("La variable a vale ahora:"+a);
        System.out.println("La variable b vale ahora:"+b);
        
        //REALIZAR INTERCAMBIO
        auxiliar=b;
        b=a;
        a=auxiliar;
        
        auxiliar=a;
        a=b;
        b=auxiliar;
      
        System.out.println("La variable a vale ahora:"+a);
        System.out.println("La variable b vale ahora:"+b);
        
        
        
    }
    
}
