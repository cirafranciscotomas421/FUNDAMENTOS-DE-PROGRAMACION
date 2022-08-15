package SENTENCIAS_DE_CONTROL;

import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
        int opc;
        int rep =0;
        int opcsino;
        int res;
        do{
        System.out.println("Menú de actividades ");
        System.out.println("1. Factorial de un numero ");
        System.out.println("2. Incrementar 16% a un número ");
        System.out.println("3. Sumar 10 números ");
        System.out.println("4. Salir ");
        System.out.println("Elige una opción: ");
        opc=leer.nextInt();
        switch (opc){
               case 1:
       
            	   do{
            		   int num,fac=1;
            		   System.out.println("Introduzca un numero entero:");
            		   num=leer.nextInt();
            		   {for(int i=num;1<i;i--)
            			   fac=i*fac;
            		   	}
            		   System.out.println("El factorial es: "+fac);
            		   System.out.println("Desea calcular otro factorial 1:Si / 2: No");
            		   res=leer.nextInt();
            		   break;
            	   		}
            	   		while(res!=2);
            
               case 2:
            	   do{
            		   double num1,nume;
            		   System.out.println("Incrementa el 16%");
            		   System.out.println("Introduce un número: ");
            		   num1=leer.nextDouble();
            		   nume=(num1*1.16);
            		   System.out.println("El incremento de "+num1+" al 16% es: "+nume);
            		   System.out.println("Desea incrementar otro número 1:Si / 2: No");
            		   res=leer.nextInt();
            		   break;
            	   		}
            	   		while(res!=2);
               case 3:
						int numy, sum = 1;
						System.out.println("Sumar 10 numeros");
						for (int i = 1; i <= 10; i++) {
							System.out.println("Introduce el numero" + i);
							numy = leer.nextInt();
							sum = sum + numy;
						}
						System.out.println("El resultado es: " + (sum - 1));
						System.out.println("Desea incrementar otro número 1:Si / 2: No");
						res = leer.nextInt();
						break;
					}
					System.out.println("Opción no válida");
					System.out.println("Desea realizar otra actividad 1: si, 2: no ");
					opcsino = leer.nextInt();

				} while (opcsino == 1);
			}

		}

