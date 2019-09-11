package Aula12;

public class Reptil extends Animal {
	// atributos
	private String corEscama;
	
	// m�todos de R�ptil
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
		System.out.println("Som de r�ptil");
	}

	// m�todos acessores e modificadores
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}
