package Aula11;

public class Tecnico extends Aluno {
	// atributos
	private int registroProfissional;
	
	// métodos
	public void praticar() {
		System.out.println(this.getNome()+ " está praticando...");
	}

	// métodos acessores e modificadores
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
