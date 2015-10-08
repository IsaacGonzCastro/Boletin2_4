
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
     //entrada por telcado
     Scanner dato = new Scanner(System.in);
     Double num1,num2,suma,resta,multiplicacion,division ;
     System.out.println("Teclea primer numero :");
     num1 = dato.nextDouble();
     System.out.println("Teclea segundo numero :");
     num2 = dato.nextDouble();
     suma = num1 + num2 ;
     System.out.println("Suma ="+suma);
     resta = num1 - num2;
     System.out.println("Resta ="+resta);
     multiplicacion = num1 * num2;
     System.out.println("Multiplicacion ="+multiplicacion);
     division = num1/num2;
     System.out.println("division ="+division);
    
    }
    
}
