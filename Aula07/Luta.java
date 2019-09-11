package Aula07;

import java.util.Random;

public class Luta {
	// atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;
	
	// m�todos p�blicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		System.out.println("=============================");
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("Luta marcada com sucesso!");
		}
		else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("A luta n�o pode ser marcada!");
		}
		System.out.println("=============================");
		System.out.println("");
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("**** DESAFIADO ****");
			this.desafiado.apresentar();
			System.out.println("**** DESAFIANTE ****");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2
			
			System.out.println("");
			System.out.println("===== RESULTADO DA LUTA =====");
			switch(vencedor) {
			case 0: // empate
				System.out.println("A luta empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			
			case 1: // desafiado vence
				System.out.println("Vit�ria de " +this.desafiado.getNome()+ "!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			
			case 2: // desafiante vence
				System.out.println("Vit�ria de " +this.desafiante.getNome()+ "!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("=============================");
		}
		else {
			System.out.println("A luta n�o pode acontecer");
		}
	}


	// m�todos acessores e modificadores
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
