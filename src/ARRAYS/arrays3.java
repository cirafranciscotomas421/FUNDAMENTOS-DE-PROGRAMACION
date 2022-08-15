package ARRAYS;

import java.util.Scanner;

public class arrays3 {
	public static void main(String[] args) {
    // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    int tam;
    int arreglo [];//un dimensión
    
    System.out.println("ingrese el tamaño de su arreglo");
    tam=leer.nextInt();
    arreglo=new int [tam];
    
    int i=0;
    while(i<=arreglo.length-1){
        System.out.println("ingrese un valor para la posición: ["+i+"]");
        arreglo[i]=leer.nextInt();
        i++;   
    }
    i=0;
    while(i<=arreglo.length-1){
        System.out.println("valor ["+i+"] almacenado en "+arreglo[i]);
        i++;
    }

    }

}


