package br.com.fiap;

import java.util.Scanner;

public class TryCheese {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nome: ");
		String name = scan.nextLine();
		System.out.println("Idade: ");
		int born = scan.nextInt();
		System.out.println("title: ");
		int title = scan.nextInt();
		System.out.println("zone: ");
		int zone = scan.nextInt();
		System.out.println("section: ");
		int section = scan.nextInt();
		
		Cheese pessoa = new Cheese(name, born, title, zone, section);

		System.out.println("Ano Atual: ");
		int CY = scan.nextInt();
		CY = pessoa.calculaIdade(CY);
		
		System.out.println(CY);


        scan.close();

	}

}