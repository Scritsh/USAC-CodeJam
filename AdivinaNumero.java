/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Cristian Miguel Marroquin Sequen
201314754

Adivina El Numero
Este es un sencillo juego de adivinar un numero, este es generado autom�ticamente por la computadora cada
vez que el usuario quiera jugar, (un n�mero entre un rango de 1100).
Una vez generado el n�mero el usuario
podr� adivinar el n�mero introduciendo el que el crea correcto, la computadora dir� si el numero que ingreso
es mayor, menor o si es el n�mero correcto. El usuario puede hacer n intentos para adivinar el n�mero.
*/

import java.util.Scanner;
public class AdivinaNumero{

   public static void main(String[] args) {
    
 int n,numero;

Scanner consola = new Scanner(System.in);
n=Integer.parseInt(args[0]);
  numero =(int)(Math.random()*100 + 1); 
		
  
 while(n!=numero){
   if (n<numero){
    System.out.println("El numero que ingreso es menor intente de nuevo");
    n= consola.nextInt();
                }
       else {
          System.out.println("El numero que ingreso es mayor intente de nuevo");
           n= consola.nextInt();
            }
                  }
if (n==numero) {
System.out.println("Felicitaciones!!!");
System.out.println("Usted adivino el numero");
               }
}
}