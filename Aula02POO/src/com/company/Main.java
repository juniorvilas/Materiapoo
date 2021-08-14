package com.company;

import java.util.Scanner;

public class Main {

	public static String dataNasc(String dia, String mes, String ano) {
		String data = dia + "/" + mes + "/" + ano;
		return data;
	}


	//public (deixa publico você consegue acessar quando quizer onde tiver, todos podem acessar)
	//static (executa igual para todos)
	//void (não retorna valor no método)
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();


		System.out.println("Digite sua data de nascimento: ");
		String dia = entrada.nextLine();
		String mes = entrada.nextLine();
		String ano = entrada.nextLine();

		char inicialN = nome.charAt(0);
		char inicialS = sobrenome.charAt(0);

		System.out.println("Seu nome é: " + nome + " " + sobrenome );
		System.out.println("Suas iniciais: " + inicialN + " " + inicialS );
		System.out.println(dataNasc(dia,mes,ano));

    }
}
