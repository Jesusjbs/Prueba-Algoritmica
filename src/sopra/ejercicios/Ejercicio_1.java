package sopra.ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void leerNumero() {
		System.out.print("Introduzca un n�mero entero: ");
		int numero = 0;
		Scanner entrada = new Scanner(System.in);

		try {
			numero = entrada.nextInt();

			if (numero < 0)
				throw new Exception();

			System.out.println((numero % 2 == 0) ? "El n�mero introducido es par." : "El n�mero introducido es impar.");

			for (int i = numero; i >= 0; i -= 2) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println("Debe introducir un n�mero entero mayor o igual a cero.");
			leerNumero();
		}
	}

}
