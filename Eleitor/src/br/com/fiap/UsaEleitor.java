package br.com.fiap;

import java.util.Scanner;

public class UsaEleitor {

	public static void main(String[] args) {
		String name = "Kevin";
		int born = 1912;
		int title = 789;
		int zone = 347;
		int section = 888;

		Scanner scan = new Scanner(System.in);

		Eleitor pessoa = new Eleitor(name, born, title, zone, section);

		System.out.println("Ano Atual: ");
		int n = scan.nextInt();
		n = pessoa.calculaIdade(n);
		System.out.println("output: "+ n);

	}

}
