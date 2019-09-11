package Aula06;

public class ControleRemoto implements Controlador {
	// atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// métodos acessores e modificadores
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	// método auxiliar
	private void mostraBarra() {
		if (this.getVolume() % 2 == 0) {
			for (int i = 0; i < this.getVolume(); i+=10) 
				System.out.print("[]");
			System.out.println("");
		}	
		else {
			for (int i = 0; i < this.getVolume() - 5; i+=10) 
				System.out.print("[]");
			System.out.println("[");
		}
	}

	// métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
		this.setVolume(50);
		System.out.println("TV ligada!");
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		this.setTocando(false);
		this.setVolume(0);
		System.out.println("TV desligada!");
	}

	@Override
	public void abrirMenu() {
		System.out.println("====== MENU ======");
		System.out.println("Está ligado? " +this.getLigado());
		System.out.println("Está tocando? " +this.getTocando());
		System.out.print("Volume: " +this.getVolume()+ " ");
		mostraBarra();
		System.out.println("==================");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			if (this.getVolume() < 100) {
				this.setVolume(this.getVolume() + 5);
				System.out.print("Volume: " +this.getVolume()+ " ");
				mostraBarra();
			}
			else
				System.out.println("Impossível aumentar volume. Volume = 100");
		}
		else 
			System.out.println("Impossível aumentar volume. TV desligada.");
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(this.getVolume() - 5);
				System.out.print("Volume: " +this.getVolume()+ " ");
				mostraBarra();
			}
			else
				System.out.println("Impossível diminuir volume. Volume = 0");
		}
		else 
			System.out.println("Impossível diminuir volume. TV desligada.");
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(0);
				System.out.println("Função mudo ativa!");
			}
			else
				System.out.println("Função mudo já está ativa.");
		}
		else 
			System.out.println("Impossível ativar função mudo. TV desligada.");
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() == 0) {
				this.setVolume(50);
				System.out.println("Função mudo desativa. Volume: "+this.getVolume());
			}
			else
				System.out.println("Função mudo já está desativada.");
		}
		else 
			System.out.println("Impossível desativar função mudo. TV desligada.");
	}

	@Override
	public void play() {
		if (this.getLigado()) {
			if (!(this.getTocando())) {
				this.setTocando(true);
				System.out.println("Play acionado!");
			}
			else 
				System.out.println("Já está tocando!");
		}
		else
			System.out.println("Impossível dar play. TV desligada.");
	}

	@Override
	public void pause() {
		if (this.getLigado()) {
			if (this.getTocando()) {
				this.setTocando(false);
				System.out.println("Pausado!");
			}
			else 
				System.out.println("Já está pausado!");
		}
		else
			System.out.println("Impossível pausar. TV desligada.");
	}
}
