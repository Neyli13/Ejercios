/*Escribe un programa que pida un n�mero entero, y conteste al usuario: �Has 
introducido el n�mero (x), gracias�. */
package practicas;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	int num;
	
	System.out.println("Introduce un numero: ");
	num=sc.nextInt();
	
	System.out.println("Has introducido el numero:  "+num);
		

	}

}
