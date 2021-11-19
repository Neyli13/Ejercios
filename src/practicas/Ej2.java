/*Escribe un programa que pregunte el precio, el tanto por ciento de descuento, y 
te diga el precio con descuento. Por ejemplo, si el precio que introduce el 
usuario es 300 y el descuento 20, el programa dirá que el precio final con 
descuento es de 240.*/

package practicas;

import java.util.*;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		float precio, porciento_descuento;
		float precio_con_descuento;
		float  descuento;
		
		System.out.println("Introduce el precio del articulo");
		precio=sc.nextFloat();
		
		System.out.println("Introduce el porcentaje de descuento que obtendra");
		porciento_descuento=sc.nextFloat();
		
		descuento=(float)(precio*(porciento_descuento/100));
		
		precio_con_descuento=(float)(precio-descuento);
		
		System.out.println("El precio final del articulo con descuento es:  "+precio_con_descuento);
		
		

	}

}
