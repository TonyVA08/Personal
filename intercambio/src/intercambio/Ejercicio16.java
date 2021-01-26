package intercambio;

public class Ejercicio16 {
    public static void main(String[] args) {
        int A,B,C,aux;
        
        A=4;
        B=7;
        C=10;
        
        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
        
        //Intercambios
        aux=A;
        A=C;
        C=B;
        B=aux;
        
        aux=C;
        C=B;
        B=A;
        A=aux;
        
        aux=B;
        B=A;
        A=C;
        C=aux;
        
        System.out.println("A:"+A); //10
        System.out.println("B:"+B); //4
        System.out.println("C:"+C); //7
        
        
    }
}
