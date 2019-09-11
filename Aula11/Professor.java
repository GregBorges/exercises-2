package Aula11;

public class Professor extends Pessoa {
	// atributos
	private String especialidade;
	private float salario;
	
	// métodos
	public void receberAumento(float aum) {
		this.salario += aum;
		System.out.println(this.getNome() +" recebeu um aumento de " +aum);
	}

	// métodos acessores e modificadores
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
