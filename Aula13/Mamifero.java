package Aula13;

public class Mamifero extends Animal {
	// atributos
	protected String corPelo;

	// métodos
	@Override
	public String emitirSom() {
		return ("Som de mamífero");
	}
}
