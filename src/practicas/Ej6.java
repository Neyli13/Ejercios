/*Escribir un programa que pida por teclado los tres coeficientes (a, b y c) de la 
ecuación ax 2 +bx+c=0 y calcule las dos soluciones suponiendo que ambas 
serán reales (es decir que la raíz queda positiva). 
//Nota: x1,2=(a±sqrt(b2 -4ac))/2 */

package practicas;

import java.util.*;

public class Ej6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);	
	
	float a, b, c;
	
	System.out.println("Introduce el valor de a");
	a=sc.nextFloat();
	
	System.out.println("Introduce el valor de b");
	b=sc.nextFloat();
	
	System.out.println("Introduce el valor de c");
	c=sc.nextFloat();
	
double	raiz=Math.sqrt(b*b-4*a*c);
double x1=(-b+raiz)/(2*a);
double x2=(-b-raiz)/(2*a);

System.out.println("Las respuestas posibles a x de los valores introducidos es  ");
System.out.println("X1 = "+x1);
System.out.println("X2 = "+x2);

	}
	
	
	}

