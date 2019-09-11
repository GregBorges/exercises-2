package Aula02;

public class Caneta {
	// atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// método que faz a caneta rabiscar
	void rabiscar() {
		if (this.tampada) 
			System.out.println("Impossível rabiscar. Caneta tampada!");
		else 
			System.out.println("Rabiscando");
	}
	
	// método que tampa a caneta
	void tampar() {
		this.tampada = true;
	}
	
	// método que destampa a caneta
	void destampar() {
		this.tampada = false;
	}
	
	// método que mostra as informações da caneta
	void infoCaneta() {
		System.out.println("Modelo da caneta: " +this.modelo);
		System.out.println("Cor da caneta: " +this.cor);
		System.out.println("Tamanho da ponta: " +this.ponta);
		System.out.println("Carga de tinta: " +this.carga);
		System.out.println("Está tampada? " +this.tampada);
	}
}
