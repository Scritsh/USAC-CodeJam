/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Cristian Miguel Marroquin Sequen
201314754

Numeros Primos
Se ingresa un n�mero entero positivo, la aplicaci�n deber� analizar la cantidad de n�meros primos que se
encuentran desde 0 hasta el n�mero ingresado e imprimir cada uno de ellos en pantalla.
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