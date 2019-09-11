/* Aula06: Pilares da POO - Encapsulamento. 
 * Este programa representa um controle remoto de uma TV. 
 * Pode-se entender que a interface Controlador é a carcaça 
 * de um controle remoto normal, disponibilizando apenas os 
 * botões para o usuário (que são os métodos disponíveis ao 
 * usuário), e o circuito do controle (que é código do programa) 
 * fica protegido. */

package Aula06;

public class Principal {
	public static void main(String[] args) {
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		c1.maisVolume();
		c1.play();
		c1.desligar();
		c1.abrirMenu();
		c1.ligar();
		c1.abrirMenu();
		c1.fecharMenu();
		c1.maisVolume();
		c1.maisVolume();
		c1.play();
		c1.ligarMudo();
		c1.abrirMenu();
	}
}
