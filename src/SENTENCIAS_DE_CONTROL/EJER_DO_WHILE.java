package SENTENCIAS_DE_CONTROL;

import java.util.Scanner;

public class EJER_DO_WHILE {

	public static void main(String[] args) {
		//captura de edad solo valores comprendidos 65 al 100
		Scanner leer=new Scanner(System.in);
		int edad;
		
		do{
		System.out.println("capturar edad");
		edad=leer.nextInt();
		}while(edad>=65 && edad<=100);
		System.out.println("solo se permiten edades del 65 al 100");

	}

}
