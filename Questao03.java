/* 
Centro Universitário de João Pessoa - Unipê
Curso: Ciências da Computação - P3
Disciplina: Programação Orientada a Objetos - Professor: Jeofton Costa
Aluno: Joel Adelaide Medeiros - RGM: 29799384
*/  

/* QUESTÃO 03:
Escreva um programa que receba o nome e sobrenome do usuário, verifique se o sobrenome é “Wayne”, 
e imprima na tela “Acesso liberado, Sr. Wayne”. Caso o sobrenome seja “Kent” o programa deve imprimir 
a mensagem “Saí daí, mané!”. Se o nome for Diana, ele deve imprimir a mensagem “Bem-vinda, Princesa de Themyscara”. 
Por fim, se nem um nome ou sobrenome se encaixar nas hipóteses anteriores, o programa deve imprimir “Cai fora!”.
*/  

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome principal do usuário: ");
		String nomePrincipal = teclado.next();
		System.out.println("Digite o sobrenome do usuário: ");
		String sobrenome = teclado.next();
		
		testeEntradaUsuario(nomePrincipal, sobrenome);
	}
	
	public static void testeEntradaUsuario(String nomePrincipal, String sobrenome) {
		
		if(sobrenome.toLowerCase().equals("wayne")) {
			System.out.println("Acesso liberado, Sr. Wayne");
		}
		else if(sobrenome.toLowerCase().equals("kent")) {
			System.out.println("Saí daí, mané!");
		}
		else if(nomePrincipal.toLowerCase().equals("diana")) {
			System.out.println("Bem-vinda, Princesa de Themyscara");
		}
		else {
			System.out.println("Cai fora!");
		}
	}
}
