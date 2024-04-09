package br.com.fiap;

import java.util.Scanner;

public class UseCheese {

	public UseCheese() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String frase;
		
		System.out.println("Fale Senha: ");
		frase = scan.nextLine();
				
		
		if(frase.equals("Senha123")) { // == não funciona em string em java
			System.out.println("Senha correta, capslock correto ");
		}else if(frase.equalsIgnoreCase("Senha123")) { // mesma coisa que o equals só que ignora case
			System.out.println("Senha correta, capslock incorreto ");
		}else {
			System.out.println("Senha incorreta ");
		}
		
		
		System.out.println(frase.length());//Size
		
		frase = frase.toUpperCase();//CAPSLOCK
		
		System.out.println(frase);
		
		frase = frase.toLowerCase();//Lowercase
		
		System.out.println(frase);	
			
		frase = frase.replace('e','p'); //troca letras da frase por outras letras da frase, incluindo palavras
		
		System.out.println(frase);

		scan.close();
	}

}
