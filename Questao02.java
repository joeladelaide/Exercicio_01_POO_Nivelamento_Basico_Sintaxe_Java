/* 
Centro Universitário de João Pessoa - Unipê
Curso: Ciências da Computação - P3
Disciplina: Programação Orientada a Objetos - Professor: Jeofton Costa
Aluno: Joel Adelaide Medeiros - RGM: 29799384
*/  

/* QUESTÃO 02:
Crie um conversor de temperaturas em Java, no qual o usuário digita um valor e a escala da 
temperatura do valor digitado. Após, o programa deve imprimir a temperatura digitada nas escalas: 
Celsius, Fahrenheit, Kelvin.
*/  

import java.util.Scanner;
import java.lang.Math;

public class Questao02 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa conversor de temperaturas - Celsius - Fahrenheit - Kelvin");
		System.out.println("Digite a temperatura: ");
		double temperatura = teclado.nextDouble();
		System.out.println("Digite a escala (Celsius - Fahrenheit - Kelvin):");
		String escala = teclado.next();
		
		if(escala.toLowerCase().equals("celsius") || escala.toLowerCase().equals("fahrenheit") || escala.toLowerCase().equals("kelvin")) {
			conversor(temperatura, escala);
		}
		else {
			System.out.println("Escala incorreta! Reinicie o programa!");
		}
	}
	
	public static void conversor(double temperatura, String escala) {
		
		if(escala.toLowerCase().equals("celsius")) {
			System.out.println(temperatura + " Celsius equivale a " + celsiusToFahrenheit(temperatura) + " Fahrenheit");
			System.out.println(temperatura + " Celsius equivale a " + celsiusToKelvin(temperatura) + " Kelvin");
		}
		else if(escala.toLowerCase().equals("fahrenheit")) {
			System.out.println(temperatura + " Fahrenheit equivale a " + fahrenheitToCelsius(temperatura) + " Celsius");
			System.out.println(temperatura + " Fahrenheit equivale a " + fahrenheitToCelsius(temperatura) + " Kelvin");
		}
		else if(escala.toLowerCase().equals("kelvin")) {
			System.out.println(temperatura + " Kelvin equivale a " + kelvinToCelsius(temperatura) + " Celsius");
			System.out.println(temperatura + " Kelvin equivale a " + kelvinToFahrenheit(temperatura) + " Fahrenheit");
		}
	}
	
	public static double celsiusToFahrenheit(double temperatura) {
		
		return ((temperatura*9/5)+32);
	}
	
	public static double celsiusToKelvin(double temperatura) {
		
		return (temperatura + 273.15);
	}
	
	public static double fahrenheitToCelsius(double temperatura) {
		
		return ((temperatura - 32)*5/9);
	}
	
	public static double fahrenheitToKelvin(double temperatura) {
		
		return ((temperatura-32)*(5/9)+273.15);
	}
	
	public static double kelvinToCelsius(double temperatura) {
		
		return (temperatura - 273.15);
	}
	
	public static double kelvinToFahrenheit(double temperatura) {
		
		return ((temperatura-273.15)*(9/5)+32);
	}
}
