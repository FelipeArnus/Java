package br.com.fiap;

public class Estudo3 {
	
	private String name;
	private int code;
	private float saldo;
	
	public Estudo3(){}
	
	public Estudo3(String name, int code, float saldo){
		this.name = name;
		this.code = code;
		this.saldo = saldo;
	}
	
	public void realizaSaque(float saldo){
		if(saldo <= this.saldo) {
			this.saldo = this.saldo - saldo; 
		}
	}
	
	public void realizaDeposito(float saldo){
		if(saldo > 0) {
			this.saldo = this.saldo + saldo; 
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
}
