package Aula03;

public class Caneta {
	// atributos
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	// m�todo que faz a caneta rabiscar
	public void rabiscar() {
		if (this.tampada) 
			System.out.println("Imposs�vel rabiscar. Caneta tampada!");
		else 
			System.out.println("Rabiscando");
	}
	
	// m�todo que tampa a caneta
	protected void tampar() {
		this.tampada = true;
	}
	
	// m�todo que destampa a caneta
	protected void destampar() {
		this.tampada = false;
	}
	
	// m�todo que mostra as informa��es da caneta
	public void infoCaneta() {
		System.out.println("Modelo da caneta: " +this.modelo);
		System.out.println("Cor da caneta: " +this.cor);
		System.out.println("Tamanho da ponta: " +this.ponta);
		System.out.println("Carga de tinta: " +this.carga);
		System.out.println("Est� tampada? " +this.tampada);
	}
}
