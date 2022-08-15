package ARRAYS;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner almacenamiento=new Scanner (System.in);
	        int dato [] = new int [10];
	        int dato2 [] = new int [10];
	        
	        int sum;
	        sum =0;
	        int producto;
	        System.out.println("INGRESA LOS DATOS 1");
	        for (int e=0; e<10;e++){
	            System.out.println("INGRESA EL PRIMER DATO PARA LA POSICION ["+e+"]");
	            dato[e]=almacenamiento.nextInt();
	        }
	        {
	        System.out.println("\nDATOS DEL ARREGLO 1");
	        for(int e=0; e<10;e++)
	         System.out.println("DATO CAPTURADO ["+e+"]:"+dato[e]);
	        }
	        System.out.println("\nDATOS DEL ARREGLO 2");
	         for(int e=0; e<10;e++){
	         System.out.println("INGRESA EL PRIMER DATO PARA LA POSICION ["+e+"]");
	         dato[e]=almacenamiento.nextInt();
	         }
	          System.out.println("\nDATO CAPTURADOS 2");
	          for(int e=0; e<10;e++){
	              System.out.println("DATO ["+e+"]:"+dato2[e]);
	  
	          }
	          for(int e=0; e<10; e++){
	              sum = dato[e]+dato2[e];{
	              System.out.println("\n LA SUMA DE LOS DOS ARREGLO ES ["+sum+"]:");
	          }}
	         for(int e=0; e<10; e++){
	              producto = dato[e]*dato2[e];{
	              
	              System.out.println("\n MULTIPLICACION DE LOS DOS ARREGLOS ES ["+producto+"]:");
	              }  
	          }
	    }
	    
	

	}


