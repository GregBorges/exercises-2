package Aula10;

public class Professor extends Pessoa {
	// atributos
	private String especialidade;
	private float salario;
	
	// m�todos
	public void receberAumento(float aum) {
		this.salario += aum;
		System.out.println("Sal�rio de " +this.getNome()+ " foi aumentado em " +aum+ " reais");
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
