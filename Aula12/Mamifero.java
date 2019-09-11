package Aula12;

public class Mamifero extends Animal {
	// atributos
	private String corPelo;
	
	// m�todos de Mam�fero
	@Override
	public void locomover() {
		System.out.println("Correndo...");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de mam�fero");
	}

	// m�todos acessores e modificadores
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
}
