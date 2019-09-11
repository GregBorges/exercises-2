package Aula03;

public class Caneta {
	// atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	// método que faz a caneta rabiscar
	public void rabiscar() {
		if (this.tampada) 
			System.out.println("Impossível rabiscar. Caneta tampada!");
		else 
			System.out.println("Rabiscando");
	}
	
	// método que tampa a caneta
	protected void tampar() {
		this.tampada = true;
	}
	
	// método que destampa a caneta
	protected void destampar() {
		this.tampada = false;
	}
	
	// método que mostra as informações da caneta
	public void infoCaneta() {
		System.out.println("Modelo da caneta: " +this.modelo);
		System.out.println("Cor da caneta: " +this.cor);
		System.out.println("Tamanho da ponta: " +this.ponta);
		System.out.println("Carga de tinta: " +this.carga);
		System.out.println("Está tampada? " +this.tampada);
	}
}
