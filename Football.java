/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Cristian Miguel Marroquin Sequen
201314754

FootBall
Tengo un amigo a quien le gusta el �Football�, el quiere saber si lanza un bal�n, cu�nto tiempo se mantiene
en el aire (s) y cuanto avanza (m) antes de tocar el suelo para poder mejorar sus habilidades como quarter
back. Para esto necesitamos un programa que reciba los par�metros de velocidad inicial (m/s) y �ngulo. Y
debemos mostrar el resultado de los c�lculos necesarios.
*/


public class Football{   

   public static void main(String[] args) {


Double velocidai=Double.parseDouble(args[0]);
Double angulo =Double.parseDouble(args[1]);
Double tiempo =((velocidai*Math.sin(angulo))/4.9);
Double distancia=(tiempo*velocidai*Math.cos(angulo));
System.out.println(("Llega a una distancia " +distancia) +("  metros en ") +(tiempo +"  segundos"));




}
}