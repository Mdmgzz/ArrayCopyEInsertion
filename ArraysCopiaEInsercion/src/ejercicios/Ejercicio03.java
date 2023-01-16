package ejercicios;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio03 {
	
	static boolean esPrimo (int numero) {
        boolean primo=true;						// comprueba si el numero es primo o no
        if (numero ==1) {						// si el numero es = a 1 el numero no es primo	
            primo=false;
        }
        for (int j = 2; j<numero;j++) {        // el for hace el modulo de j y si al hacerlo este es = 0 entonces no será primo
            if (numero%j==0) {
                primo=false;
            }
        }
        return (primo);    // devuelve primo
    }

	public static void main(String[] args) {
		//bloque de variables
		int numerosprimos[]=new int[10];					//tabla de los numeros
		int primo=0;										// para  los numeros primos empezaran a colocarse en la pos 0
		int NoPrimo=numerosprimos.length-1;					// los numeros no primos se empiezan a guardar por el final 
		int numero=0;										//se guarda el numero que se vaya escribiendo
		//creamos scanner
		Scanner sc= new Scanner(System.in);
		
		for (int i=0;i<=numerosprimos.length-1;i++) {       // el for te pide un numero tantas veces como casillas tenga la tabla
			System.out.println("introduce un numero: ");
			numero=sc.nextInt();							// se guarda en la variable numero
			
			if (esPrimo(numero)) {							// antes de pedir otro numero se comprueba si este es primo o no
				numerosprimos[primo]=numero;				// si lo es se guarda en la primera posicion de la tabla
				primo++;									// aumenta el contador de primos para que no se solapen
			}else {
				numerosprimos[NoPrimo]=numero;				// si no lo es, se guarda en las ultimas partes de la tabla 
				NoPrimo--;									// el contador de no primo resta 1 para que no se solapen
			}
			
		}
		System.out.println(Arrays.toString(numerosprimos));	// mostramos resultado
		
		//cerramos scanner 
		sc.close();
	}
	
}
