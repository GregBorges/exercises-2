package Aula12;

public class Peixe extends Animal {
	// atributos
	private String corEscama;
	
	// m�todos de peixe
	@Override
	public void locomover() {
		System.out.println("Nadando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo subst�ncias...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando bolha...");
	}

	// m�todos acessores e modificadores
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
