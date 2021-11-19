/*Suponiendo que 1 euro = 1.33250 dólares. Escribe un programa que pida al 
usuario un número de dólares y calcule el cambio en euros.*/
package practicas;

import java.util.*;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
	float dinero_dolar, dinero_euro;
	
	System.out.println("Introduce el valor en dolares");
	dinero_dolar=sc.nextFloat();
	
	dinero_euro=(float) (dinero_dolar/1.33250);
	
	System.out.println("El valor en euros es de:  "+dinero_euro);

	}

}
