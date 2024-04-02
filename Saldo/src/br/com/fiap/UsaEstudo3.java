package br.com.fiap;
import java.util.Scanner;


public class UsaEstudo3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Nome do Cabresto: ");
		String name = scan.nextLine();
		System.out.println("Codigo: ");
		int code = scan.nextInt();
		
		int c = 0;
		float saldo = 0;
		while(c == 0) {
			System.out.println("Saldo: ");
			saldo = scan.nextFloat();
			if(saldo > 0){c = 1;}
		}c=0;
		
		Estudo3 jjj = new Estudo3(name, code, saldo);
		
//loop here
		int h = 0;
		while(c == 0) {
			h = 0;
			System.out.println("Gostaria de realizar um Saque(1) ou um Deposito(2) ou Sair(3): ");
			h = scan.nextInt();
			if(h == 1) {
				System.out.println("Valor de Saque: ");
				saldo = scan.nextFloat();
				jjj.realizaSaque(saldo);
			}else if(h==2){
				System.out.println("Valor de Deposito: ");
				saldo = scan.nextFloat();
				jjj.realizaDeposito(saldo);
			}else if(h==3){
				c = 1;
				System.out.println(jjj.getName());
				System.out.println(jjj.getCode());
				System.out.println(jjj.getSaldo());
			}
		}

		scan.close();
	}

}
