package Aula10;

public class Aluno extends Pessoa {
	// atributos
	private int matricula;
	private String curso;
	
	// m�todos
	public void cancelarMatricula() {
		System.out.println("Matr�cula de " +this.getNome()+" ser� cancelada");
	}

	// m�todos acessores e modificadores
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
