package Aula11;

public class Bolsista extends Aluno {
	// atributos
	private int bolsa;
	
	// métodos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " +this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome()+ " é bolsista. Pagamento facilitado!");
	}

	// métodos acessores e modificadores
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
}
