package Aula11;

public class Tecnico extends Aluno {
	// atributos
	private int registroProfissional;
	
	// m�todos
	public void praticar() {
		System.out.println(this.getNome()+ " est� praticando...");
	}

	// m�todos acessores e modificadores
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
