/*Escribe un programa que pida un número entero, y conteste al usuario: “Has 
introducido el número (x), gracias”. */
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
