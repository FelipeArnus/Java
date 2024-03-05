package br.com.fiap;

public class RadioEncapsulada {
	
	//atributos
	private int volume;
	private float estacao;
	
	
	//getters & setters
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if(volume >= 0 && volume <= 100) {
				this.volume = volume;
			}else {
				throw new Exception("Volume fora da faixa" + "permitida (0 a 100)");
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public float getEstacao() {
		return estacao;
	}
	public void setEstacao(float estacao) {
		try {
			if(estacao >= 80.0f && estacao <= 105.0f) {
				this.estacao = estacao;
			}else {
				throw new Exception("Estacao fora da faixa" + "permitida (80.0 a 105.0)");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//metodos
	public void aumentarVolume() {
		if(volume < 100){
			volume++;
		}

	}
	public void diminuirVolume() {
		if(volume > 0 ){
			volume--;
		}
	}
	public void mostrar() {
		System.out.println("Volume: "+ volume + "\nEstação: " + estacao);
	}
}
