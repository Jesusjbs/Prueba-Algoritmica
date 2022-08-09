package sopra.ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void obtenerSalario() {
		int horasTrabajadas = leerHorasTrabajadas();
		Double tarifa = leerTarifa();
		System.out.println((horasTrabajadas > 40) ? String.format("El sueldo recibido es %s euros", 
				(40*tarifa)+((horasTrabajadas-40)*tarifa*1.5)) : String.format("El sueldo recibido es %s euros", 
						horasTrabajadas*tarifa));
	}
	
	public static int leerHorasTrabajadas() {
		System.out.print("Introduzca las horas trabajadas: ");
		Scanner entradaHoras = new Scanner(System.in);

		try {
			return entradaHoras.nextInt();
		}catch(Exception e) {
			System.out.println("Debe introducir un número entero mayor o igual a cero.");
			return leerHorasTrabajadas();
		}
	}
	
	public static Double leerTarifa() {		
		System.out.print("Introduzca la tarifa: ");
		Scanner entradaTarifa = new Scanner(System.in);
		try {
			return entradaTarifa.nextDouble();
		}catch(Exception e) {
			System.out.println("Debe introducir un número, si es decimal con coma, mayor o igual a cero.");
			return leerTarifa();
		}
	}
	
}
