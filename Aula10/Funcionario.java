package Aula10;

public class Funcionario extends Pessoa {
	// atributos
	private String setor;
	private boolean trabalhando;
	
	// m�todos
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}

	// m�todos acessores e modificadores
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}
