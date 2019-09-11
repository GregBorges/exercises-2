package Aula12;

public class Reptil extends Animal {
	// atributos
	private String corEscama;
	
	// métodos de Réptil
	@Override
	public void locomover() {
		System.out.println("Rastejando...");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}

	// métodos acessores e modificadores
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
