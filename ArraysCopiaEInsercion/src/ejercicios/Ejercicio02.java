package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//bloque de variables 
		int numeros[]=new int[20];						//tabla en la que se generarán los numeros
		int numerosordenados[]=new int[20];				// tabla en la que apareceran los numeros ordenados
		int par=0;										// la variable par comienza en 0 ya que los numeros pares van al principio
		int impar=numeros.length-1;						// la variable impar empieza por la ult casilla de la tabla 
		//creamos el for para generar los numeros aleatorios
		for (int i=0;i<=numeros.length-1;i++) {			// el for funcionara hasta que se generen tantos numeros como casillas tenga la tabla
			numeros[i]= (int) (Math.random()* 101);
		}
		System.out.println(Arrays.toString(numeros));   // mostramos la tabla creada
		
		for (int i=0;i<=numeros.length-1;i++) {			// este for comprueba si los numeros de la primera tabla y los va guardando en orden 
			if (numeros[i]%2==0) {						// si es par se guardará en la primera posicion 
				numerosordenados[par]=numeros[i];		// la variable par aumenta para que no se solapen los numeros
				par++;
			}else {										// si el numero no es par quiere decir que es impar
				numerosordenados[impar]=numeros[i];		// se guarda en la ult posicion de la tabla
				impar--;								// la variable impar desciende una unidad para que no se solapen
			}
		}
		System.out.println(Arrays.toString(numerosordenados));	// mostramos el resultado
		

	}

}
