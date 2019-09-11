package Aula14;

public class Gafanhoto extends Pessoa {
	// atributos
	private String login;
	private int totAssistido;
	
	// métodos
	public void viuMaisUm() {
		this.totAssistido++;
	}
	
	@Override
	public String toString() {
		return ("Gafanhoto " + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido);
	}

	// construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	// métodos acessores e modificadores
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
}
