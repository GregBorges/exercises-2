package Aula09;

public class Livro implements Publicacao {
	// atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// métodos públicos
	public void detalhes() {
		System.out.println("========== DETALHES DO LIVRO ==========");
		System.out.println("Título do livro: " +this.getTitulo());
		System.out.println("Autor: " +this.getAutor());
		System.out.println("Total de páginas: " +this.totPaginas);
		System.out.println("Página atual: " +this.getPagAtual());
		System.out.println("Está aberto? " +this.getAberto());
		System.out.println("Informações do leitor: Nome - " +this.getLeitor().getNome());
		System.out.println("Informações do leitor: Idade - " +this.getLeitor().getIdade()+ " anos");
		System.out.println("Informações do leitor: Sexo - " +this.getLeitor().getSexo());
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

	// métodos acessores e modificadores
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

	// métodos da interface
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
				System.out.println("Não existe essa página!");
			else {
				System.out.println("Folheando livro...");
				this.setPagAtual(p);
			}
		}
		else 
			System.out.println("Impossível folhear. Livro fechado!");
	}

	@Override
	public void avancarPag() {
		if (this.getAberto()) {
			if(this.getPagAtual() + 1 > this.getTotPaginas()) 
				System.out.println("Livro está na última página!");
			else {
				System.out.println("Próxima página...");
				this.setPagAtual(this.getPagAtual() + 1);
			}
		}
		else 
			System.out.println("Impossível avançar página. Livro fechado!");
	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			if(this.getPagAtual() == 1) 
				System.out.println("Livro está na primeira página!");
			else {
				System.out.println("Voltando página...");
				this.setPagAtual(this.getPagAtual() - 1);
			}
		}
		else 
			System.out.println("Impossível voltar página. Livro fechado!");
	}
}
