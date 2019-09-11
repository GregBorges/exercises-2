package Aula11;

public class Bolsista extends Aluno {
	// atributos
	private int bolsa;
	
	// m�todos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " +this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome()+ " � bolsista. Pagamento facilitado!");
	}

	// m�todos acessores e modificadores
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
}
