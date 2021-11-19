/*Suponiendo que pi = 3.1416. Escribe un programa que pida al usuario que 
introduzca el radio, y presente por pantalla el cálculo del perímetro de la 
circunferencia (2*pi*r), el área del círculo (pi*r2 ), y el volumen de la esfera (V = 
//4*pi*r3 /3*/

package practicas;

import java.util.*;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);	
		
		float radio, pi, perimetro, area, volumen;
		pi=(float) 3.1416;
		
		System.out.println("Introduce el valor del radio de la circunferencia/circulo/esfera");
		radio=sc.nextFloat();
				
		perimetro=(float)(2*pi*radio);
		area= (float) ((float)  pi*(Math.pow(radio,2)));
		volumen=(float) ((4*pi*(Math.pow(radio,3))/3));
		
		System.out.println("El valor del perimetro de la circunferencia es de: "+perimetro);
		System.out.println("El valor del area del circulo  es de: "+area);
		System.out.println("El valor del volumen de la esfera  es de: "+volumen);

	}

}
