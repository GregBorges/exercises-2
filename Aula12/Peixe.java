package Aula12;

public class Peixe extends Animal {
	// atributos
	private String corEscama;
	
	// métodos de peixe
	@Override
	public void locomover() {
		System.out.println("Nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha...");
	}

	// métodos acessores e modificadores
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
