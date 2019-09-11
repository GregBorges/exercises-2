package Aula07;

public class Lutador {
	// atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// métodos públicos
	public void apresentar() { // apresenta o lutador de uma forma completa
		System.out.println("=== CHEGOU O MOMENTO! APRESENTANDO O LUTADOR " +this.getNome()+ " ===");
		System.out.println("Um " +this.getNacionalidade()+ " com muita sede de ganhar, tem " +this.getIdade()+ " anos");
		System.out.println("e " +this.getAltura()+ "m de altura, pesando atualmente " +this.getPeso()+ " Kg");
		System.out.println("tem os seguintes resultados:");
		System.out.print("Vitórias: " +this.getVitorias());
		System.out.print("\tDerrotas: " +this.getDerrotas());
		System.out.println("\tEmpates: " +this.getEmpates());
		System.out.println("===========================================================");
	}
	
	public void status() {	// breve apresentação do lutador
		System.out.println(this.getNome()+ " é um peso " +this.getCategoria());
		System.out.println("Ganhou: " +this.getVitorias()+ " luta(s)");
		System.out.println("Perdeu: " +this.getDerrotas()+ " luta(s)");
		System.out.println("Empatou: " +this.getEmpates()+ " luta(s)");
		System.out.println("=========================");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	// construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, 
			float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso); // meio utilizado para fazer a categoria atualizar sempre que o peso mudar
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// métodos acessores e modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}
		else if(this.peso <= 83.9) {
			this.categoria = "Médio";	
		}
		else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
