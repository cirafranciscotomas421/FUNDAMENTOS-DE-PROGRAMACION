package SENTENCIAS_DE_CONTROL;

import java.util.Scanner;

public class EJER_IF {

	public static void main(String[] args) {
		
	Scanner leer=new Scanner(System.in);
	System.out.println("Pedro vende pasteles, cada pastel tiene un costo 500, si una persona compra mas de 10 pasteles \n"
	+ "Pedro hace un descuento de 15%, mas de 20 pasteles; Pedro hace un descuento de 30%, y mas de 25 Pedro hace\n"
	+ "un descuento de 35%, Calcular el precio total a pagar por las compras de distintas cantidades de pasteles.");
	String pastel=leer.nextLine();
	   
	 double resultado;
	 System.out.println("¿cuantos pasteles compro victorina?");
	 int cantidad=leer.nextInt();
	 if (cantidad>=10 && cantidad<20){   
	     resultado=(500*cantidad)-((116*cantidad)*0.15);
	        System.out.println("la cantidad a pajar $"+resultado);
	        }
	        else if(cantidad >=20&&cantidad<25){
	        resultado=(500*cantidad)-((500*cantidad)*0.3);
	            System.out.println("la cantidad a pajar es $"+resultado);
	        }
	        else if(cantidad >=25){
	            resultado=(500*cantidad)-((500*cantidad)*0.35);
	            System.out.println("la cantidad a pajar es $"+ resultado);}
	        else if(cantidad <10){
	            resultado=(500*cantidad);
	            System.out.println("total a pajar es $"+resultado);
	        }
	}
}
