package Aula09;

public class Livro implements Publicacao {
	// atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// m�todos p�blicos
	public void detalhes() {
		System.out.println("========== DETALHES DO LIVRO ==========");
		System.out.println("T�tulo do livro: " +this.getTitulo());
		System.out.println("Autor: " +this.getAutor());
		System.out.println("Total de p�ginas: " +this.totPaginas);
		System.out.println("P�gina atual: " +this.getPagAtual());
		System.out.println("Est� aberto? " +this.getAberto());
		System.out.println("Informa��es do leitor: Nome - " +this.getLeitor().getNome());
		System.out.println("Informa��es do leitor: Idade - " +this.getLeitor().getIdade()+ " anos");
		System.out.println("Informa��es do leitor: Sexo - " +this.getLeitor().getSexo());
		System.out.println("=======================================");
	}
	
	// construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
		this.pagAtual = 1;
		this.setAberto(false);
	}

	// m�todos acessores e modificadores
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	// m�todos da interface
	@Override
	public void abrir() {
		this.setAberto(true);
		this.setPagAtual(1);
		System.out.println("Livro aberto!");
	}

	@Override
	public void fechar() {
		this.setAberto(false);
		this.setPagAtual(0);
		System.out.println("Livro fechado!");
	}

	@Override
	public void folhear(int p) {
		if (this.getAberto()) {
			if(p > this.getTotPaginas()) 
				System.out.println("N�o existe essa p�gina!");
			else {
				System.out.println("Folheando livro...");
				this.setPagAtual(p);
			}
		}
		else 
			System.out.println("Imposs�vel folhear. Livro fechado!");
	}

	@Override
	public void avancarPag() {
		if (this.getAberto()) {
			if(this.getPagAtual() + 1 > this.getTotPaginas()) 
				System.out.println("Livro est� na �ltima p�gina!");
			else {
				System.out.println("Pr�xima p�gina...");
				this.setPagAtual(this.getPagAtual() + 1);
			}
		}
		else 
			System.out.println("Imposs�vel avan�ar p�gina. Livro fechado!");
	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			if(this.getPagAtual() == 1) 
				System.out.println("Livro est� na primeira p�gina!");
			else {
				System.out.println("Voltando p�gina...");
				this.setPagAtual(this.getPagAtual() - 1);
			}
		}
		else 
			System.out.println("Imposs�vel voltar p�gina. Livro fechado!");
	}
}
