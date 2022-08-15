package SENTENCIAS_DE_CONTROL;

import java.util.Scanner;

public class EJER_WHILE {
	
public static void main(String[] args) {
	//calcular factorial de un número
		Scanner leer=new Scanner(System.in);
        int factorial=1;
        int i=1;
        System.out.println("introduzca el número");
        int n=leer.nextInt();
        while(i<=n){
            factorial=i*factorial;
            i++;
        }
        System.out.println("la factorial es= "+factorial);
    } 
}
	