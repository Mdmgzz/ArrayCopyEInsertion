package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Bloque de variables
		int tablaenteros[]=new int[10];
		int ordenados[]= new int [0];
		int rastreador=0;

		
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<tablaenteros.length;i++) {
			System.out.println("Introduce un numero: ");
			tablaenteros[i]=sc.nextInt();
		}
		Arrays.sort(tablaenteros);
		
		for (int i=0;i<=tablaenteros.length-1;i++) {
			if (i==0 || tablaenteros[i]!=tablaenteros[i-1]) {
				ordenados=Arrays.copyOf(ordenados, ordenados.length+1);
				ordenados[rastreador++]=tablaenteros[i];
			}
		
		}
		System.out.println(Arrays.toString(tablaenteros));
			
		System.out.println(Arrays.toString(ordenados));
	
		//cerramos scanner
		sc.close();
		
	}

}
