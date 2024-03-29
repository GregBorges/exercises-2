package Aula12;

public abstract class Animal {
	// atributos
	protected float peso;
	protected int idade;
	protected int membros;
	
	// m�todos abstratos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	// m�todos acessores e modificadores
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
}
