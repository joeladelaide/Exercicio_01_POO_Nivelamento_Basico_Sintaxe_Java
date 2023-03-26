/* 
Centro Universitário de João Pessoa - Unipê
Curso: Ciências da Computação - P3
Disciplina: Programação Orientada a Objetos - Professor: Jeofton Costa
Aluno: Joel Adelaide Medeiros - RGM: 29799384
*/  

/* QUESTÃO 04:
Escreva um programa que receba um número digitado pelo usuário. 
Se o número for par, ele deve exibir na tela o cálculo da raiz cúbica. 
Se o número for ímpar, ele deve exibir na tela o cálculo da raiz quadrada.
*/  

import java.util.Scanner;
import java.lang.Math;

public class Questao04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa para calcular a raiz quadrada/cúbica");
		System.out.println("Caso o número inserido for par, calculo da raiz cúbica");
		System.out.println("Caso o número inserido for impar, calculo da raiz quadrada");
		System.out.println("Digite um numero: ");
		
		double num = teclado.nextInt();
		
		if(num %2 == 0) {
			System.out.println("O calculo da raiz cúbica de " + num + " será: " + raizCubica(num));
		}
		else {
			System.out.println("O calculo da raiz quadrada de " + num + " será: " + raizQuadrada(num));
		}
		
		teclado.close();
	}
	
	public static double raizQuadrada(double num) {
		return Math.sqrt(num);
	}
	
	public static double raizCubica(double num) {
		return Math.cbrt(num);
	}
}
