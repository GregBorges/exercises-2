/* Aula06: Pilares da POO - Encapsulamento. 
 * Este programa representa um controle remoto de uma TV. 
 * Pode-se entender que a interface Controlador � a carca�a 
 * de um controle remoto normal, disponibilizando apenas os 
 * bot�es para o usu�rio (que s�o os m�todos dispon�veis ao 
 * usu�rio), e o circuito do controle (que � c�digo do programa) 
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
