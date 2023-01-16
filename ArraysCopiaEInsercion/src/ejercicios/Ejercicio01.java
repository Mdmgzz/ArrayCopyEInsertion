package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int tabla[]= new int[15];	// array que guardara los numeros introducidos
		int numfinal;				//guardara el ultimo numero para luego moverlo a la primera posicion
		
		// creamos scanner
		Scanner sc=new Scanner (System.in);
		
		// creamos un for para preguntar al usuario los 15 numeros y los iremos guardando en un  array
		for (int i=0;i<=tabla.length-1;i++) {
			System.out.println("Introduce un numero: ");			// pregunta por un numero un total de 15 vecez
			tabla[i]=sc.nextInt();
		}
		
		// una vez guardados los 15 numeros
		// guardamos el ultimo numero en la variable numfinal
		
		numfinal=tabla[tabla.length-1];
		System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
		tabla[0]=numfinal; 
		System.out.println(Arrays.toString(tabla));
		
		
		//cerramos scanner
		sc.close();

	}

}
