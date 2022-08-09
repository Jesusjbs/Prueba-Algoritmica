package sopra.test;

import sopra.ejercicios.Ejercicio_1;
import sopra.ejercicios.Ejercicio_2;
import sopra.ejercicios.Ejercicio_3;

public class Tests {

	public static void main(String[] args) {
		testEjercicio1();
		testEjercicio2();
		testEjercicio3();
	}
	
	public static void testEjercicio1() {
		System.out.println("========== Ejercicio 1 ==========");
		Ejercicio_1.leerNumero();
		System.out.println("\n=================================\n");
	}
	
	public static void testEjercicio2() {
		System.out.println("========== Ejercicio 2 ==========");
		Ejercicio_2.leerPersonas();
		System.out.println("=================================\n");		
	}

	public static void testEjercicio3() {
		System.out.println("========== Ejercicio 3 ==========");
		Ejercicio_3.obtenerSalario();
		System.out.println("=================================");		
	}
}
