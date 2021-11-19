/*Escribe un programa que pregunte al usuario los dos lados de un rectángulo y 
presente por pantalla el cálculo del perímetro (suma de los lados) y el área 
(base por altura). */

package practicas;

import java.util.*;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		int base, altura, perimetro, area;

		System.out.println("Introduce el valor del lado 1 del rectangulo (base) en metros");
		base=sc.nextInt();
		
		System.out.println("Introduce el valor del lado 2 del rectangulo (altura) en metros");
		altura=sc.nextInt();
		
	
		perimetro = base+altura;
		area = base*altura;
		
		System.out.println("El valor del perimetro es de :  "+perimetro);
		System.out.println("El valor del area es de :  "+area );

	}

}
