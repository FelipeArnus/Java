package br.com.fiap;
import java.util.Scanner;

public class UsaEstudos2 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Initialize the Scanner object
		Estudos2 usaE = new Estudos2();
		int x,y;
		
		System.out.println("receba: ");
		x = scan.nextInt();
		
		usaE.mostrax(x);
		
		System.out.println("receba: ");
		y = scan.nextInt();
		
		usaE.mostrax(y);
	}

}