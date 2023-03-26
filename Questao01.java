/* 
Centro Universitário de João Pessoa - Unipê
Curso: Ciências da Computação - P3
Disciplina: Programação Orientada a Objetos - Professor: Jeofton Costa
Aluno: Joel Adelaide Medeiros - RGM: 29799384
*/  

/* QUESTÃO 01:
Desenvolva uma calculadora em Java, no qual o usuário deve digitar o valor de um número do qual ele 
deseja submeter o cálculo e que possa escolher qual das operações básicas da matemática a calculadora 
deve realizar os cálculos. A calculadora também deve ter a opção de realizar todas as operações básicas, 
bem como realizar cálculos de potenciação e raiz cúbica e quadrada.
*/  

import java.util.Scanner;
import java.lang.Math;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("*-*-*-*-*- CALCULADORA -*-*-*-*-*\n");

		System.out.println("OPERAÇÕES:");
		System.out.println("Digite + para SOMA");
		System.out.println("Digite - para SUBTRAÇÃO");
		System.out.println("Digite * para MULTIPLICAÇÃO");
		System.out.println("Digite / para DIVISÃO");
		System.out.println("Digite ^ para POTENCIAÇÃO");
		System.out.println("Digite R2 para RAIZ QUADRADA");
		System.out.println("Digite R3 para RAIZ CÚBICA\n");
		
		System.out.println("Digite a entrada 1: ");
		double entrada1 = teclado.nextDouble();
		System.out.println("Digite a operação: ");
		String operacao = teclado.next();
		
		if(operacao.toUpperCase().equals("R2") || operacao.toUpperCase().equals("R3")) {
			if(operacao.toUpperCase().equals("R2")) {
				System.out.println("A raiz quadrada de " + entrada1 + " será " + raizQuadrada(entrada1));
			}
			else {
				System.out.println("A raiz cúbica de " + entrada1 + " será " + raizCubica(entrada1));
			}
		}
		else if(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/") || operacao.equals("^")){
			
			System.out.println("Digite a entrada 2: ");
			double entrada2 = teclado.nextDouble();
			
			if(operacao.equals("+")) {
				System.out.println("A soma de " + entrada1 + " + " + entrada2 + " será " + soma(entrada1, entrada2));
			}
			else if(operacao.equals("-")) {
				System.out.println("A subtração de " + entrada1 + " - " + entrada2 + " será " + subtracao(entrada1, entrada2));
			}
			else if(operacao.equals("*")) {
				System.out.println("A multiplicação de " + entrada1 + " * " + entrada2 + " será " + multiplicacao(entrada1, entrada2));
			}
			else if(operacao.equals("/")) {
				System.out.println("A divisão de " + entrada1 + " / " + entrada2 + " será " + divisao(entrada1, entrada2));
			}
			else if(operacao.equals("^")) {
				System.out.println("A potenciação de " + entrada1 + " ^ " + entrada2 + " será " + potenciacao(entrada1, entrada2));
			}
		}
		else {
			System.out.println("\nOPERAÇÃO INCORRETA! REINICIE A CALCULADORA!");
		}
	}
	
	public static double raizQuadrada(double entrada1) {
		return Math.sqrt(entrada1);
	}
	
	public static double raizCubica(double entrada1) {
		return Math.cbrt(entrada1);
	}
	
	public static double soma(double entrada1, double entrada2) {
		return entrada1 + entrada2;
	}
	
	public static double subtracao(double entrada1, double entrada2) {
		return entrada1 - entrada2;
	}
	
	public static double multiplicacao(double entrada1, double entrada2) {
		return entrada1 * entrada2;
	}
	
	public static double divisao(double entrada1, double entrada2) {
		return entrada1 / entrada2;
	}
	
	public static double potenciacao(double entrada1, double entrada2) {
		return Math.pow(entrada1, entrada2);
	}
}
