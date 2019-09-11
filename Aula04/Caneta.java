package Aula04;

public class Caneta {
	// atributos
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	// construtor
	public Caneta(String modelo, String cor, float ponta) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampar();
	}
	
	// métodos acessores e modificadores
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean getTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	// métodos
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void infoCaneta() {
		System.out.println("==== SOBRE A CANETA ====");
		System.out.println("Modelo: " +this.getModelo());
		System.out.println("Ponta: " +this.getPonta());
		System.out.println("Cor: " +this.getCor());
		System.out.println("Tampada: "+this.getTampada());
	}
}
