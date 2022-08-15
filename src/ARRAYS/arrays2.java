package ARRAYS;

import java.util.Scanner;

public class arrays2 {
	public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); 
        //definir las variables
        
        double radio, altura, v,a,valor_pi=Math.PI;
                
        //pedir el valor del radio del cilindro
        System.out.println("Introduce el radio del cilindro");
        radio = leer.nextInt(); //almacenar el valor del radio del cilindro en un variable
        System.out.println("Introduce el altura del cilindro"); //pedir el valor de la altura del cilindro
        altura = leer.nextInt(); //almacenar el valor de la altura del cilindro en un variable
        a = (2*valor_pi*radio*altura); //calcular el área del cilindro
        v = (valor_pi*(radio*2)*altura); //calcular el volumen del cilindro
        System.out.println("El área del cilindro es: "+a); //mostrar el área del cilindro
        System.out.println("El volumen del cilindro es: "+v);//mostrar el volumen del cilindro
        }
       }



