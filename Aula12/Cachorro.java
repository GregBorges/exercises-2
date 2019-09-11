package Aula12;

public class Cachorro extends Mamifero {
	// métodos de Cachorro
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
	
	public void enterrarOsso() {
		System.out.println("Enterrando osso...");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando rabo...");
	}
}
