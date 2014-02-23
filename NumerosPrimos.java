/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Cristian Miguel Marroquin Sequen
201314754

Numeros Primos
Se ingresa un número entero positivo, la aplicación deberá analizar la cantidad de números primos que se
encuentran desde 0 hasta el número ingresado e imprimir cada uno de ellos en pantalla.
*/
public class NumerosPrimos{   

   public static void main(String[] args) {
    
int cont;
int numero=Integer.parseInt(args[0]);

switch(numero){
        case 1:
        System.out.println("1");
        break;
        case 2:
        System.out.println("2");
        break;
        default:
           System.out.println("2");
           for (cont=3;cont<numero;cont++){
                if (((Math.pow(2,cont-1))%cont)==1) System.out.println(cont);
                                         }
            System.out.println(numero);  
               }

}
}