package br.com.fiap;

public class UsaRadio {

	public static void main(String[] args) {
		
		Radio radio1 = new Radio();
		
		radio1.volume = 5;
		radio1.estacao = 89.f;
		radio1.mostrar();
		
		radio1.trocarEstacao(92.5f);
		radio1.diminuirVolume();
		radio1.aumentarVolume();
		radio1.mostrar();

	}

}
