package Aula11;

public class Professor extends Pessoa {
	// atributos
	private String especialidade;
	private float salario;
	
	// m�todos
	public void receberAumento(float aum) {
		this.salario += aum;
		System.out.println(this.getNome() +" recebeu um aumento de " +aum);
	}

	// m�todos acessores e modificadores
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
