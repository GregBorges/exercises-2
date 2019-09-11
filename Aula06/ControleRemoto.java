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

	// m�todos acessores e modificadores
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
	
	// m�todo auxiliar
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

	// m�todos abstratos
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
		System.out.println("Est� ligado? " +this.getLigado());
		System.out.println("Est� tocando? " +this.getTocando());
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
				System.out.println("Imposs�vel aumentar volume. Volume = 100");
		}
		else 
			System.out.println("Imposs�vel aumentar volume. TV desligada.");
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
				System.out.println("Imposs�vel diminuir volume. Volume = 0");
		}
		else 
			System.out.println("Imposs�vel diminuir volume. TV desligada.");
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() > 0) {
				this.setVolume(0);
				System.out.println("Fun��o mudo ativa!");
			}
			else
				System.out.println("Fun��o mudo j� est� ativa.");
		}
		else 
			System.out.println("Imposs�vel ativar fun��o mudo. TV desligada.");
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado()) {
			if (this.getVolume() == 0) {
				this.setVolume(50);
				System.out.println("Fun��o mudo desativa. Volume: "+this.getVolume());
			}
			else
				System.out.println("Fun��o mudo j� est� desativada.");
		}
		else 
			System.out.println("Imposs�vel desativar fun��o mudo. TV desligada.");
	}

	@Override
	public void play() {
		if (this.getLigado()) {
			if (!(this.getTocando())) {
				this.setTocando(true);
				System.out.println("Play acionado!");
			}
			else 
				System.out.println("J� est� tocando!");
		}
		else
			System.out.println("Imposs�vel dar play. TV desligada.");
	}

	@Override
	public void pause() {
		if (this.getLigado()) {
			if (this.getTocando()) {
				this.setTocando(false);
				System.out.println("Pausado!");
			}
			else 
				System.out.println("J� est� pausado!");
		}
		else
			System.out.println("Imposs�vel pausar. TV desligada.");
	}
}
