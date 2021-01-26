package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,segundos,minutos,horas;
        
        System.out.println("Escriba los segundos:");
        n=teclado.nextInt();
        horas=n/3600;
        minutos=n%3600/60; //Idem minutos=(n-horas*3600)/60;
        segundos=n%60;
        
        //Otra version
        minutos=n/60;
        segundos=n%60;
        horas=minutos/60;
        minutos=minutos%60;
        
        System.out.println("La cantidad en horas es "+horas);
        System.out.println("La cantidad en minutos es "+minutos);
        System.out.println("La cantidad en segundos es "+segundos);
        
        
        
    }
    
}
