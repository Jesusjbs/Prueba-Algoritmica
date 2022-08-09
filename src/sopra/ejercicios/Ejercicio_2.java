package sopra.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio_2 {

	static class Persona {

		private int edad;
		private Sexo sexo;

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public Sexo getSexo() {
			return sexo;
		}

		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}

		public Persona(int edad, Sexo sexo) {
			this.edad = edad;
			this.sexo = sexo;
		}
	}

	public static void leerPersonas() {
		List<Persona> personas = new ArrayList<>();
		int mayoresMasculinas = 0;
		int mayoresFemeninas = 0;
		int masculinas = 0;

		for (int i = 0; i < 50; i++) {
			personas.add(new Persona(new Random().nextInt(100), 
					Sexo.values()[new Random().nextInt(Sexo.values().length)]));
		}

		for (Persona p : personas) {
			if (p.getSexo().equals(Sexo.MASCULINO)) {
				masculinas++;
				if (p.getEdad() >= 18)
					mayoresMasculinas++;
			} else if (p.getSexo().equals(Sexo.FEMENINO) && p.getEdad() >= 18) {
				mayoresFemeninas++;
			}
		}

		System.out.println(String.format("Cantidad de personas mayores de edad: %s", 
				mayoresMasculinas + mayoresFemeninas));
		System.out.println(String.format("Cantidad de personas menores de edad: %s",
				personas.size() - (mayoresMasculinas + mayoresFemeninas)));
		System.out.println(String.format("Cantidad de personas masculinas mayores de edad: %s", mayoresMasculinas));
		System.out.println(String.format("Cantidad de personas femeninas menores de edad: %s",
				personas.size() - (masculinas + mayoresFemeninas)));
		System.out.println(String.format("Porcentaje que representan las personas mayores de edad respecto "
				+ "al total de personas: %s%%", ((mayoresMasculinas + mayoresFemeninas)*100/personas.size())));
		System.out.println(String.format("Porcentaje que representan las mujeres respecto al total de " 
				+ "personas: %s%%", ((mayoresFemeninas + personas.size() - (masculinas + mayoresFemeninas))*100/personas.size())));
	}

}
