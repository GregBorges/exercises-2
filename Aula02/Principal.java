// Aula01: Instalando o JDK
// Aula02: Criando classes e objetos

package Aula02;

public class Principal {
	public static void main(String args[]) {
		Caneta c1 = new Caneta();  // criando uma caneta
		c1.modelo = "BIC cristal";
		c1.cor = "Preta";
		c1.ponta = 0.5F;
		c1.carga = 99;
		c1.tampar();
		c1.infoCaneta();
		
		Caneta c2 = new Caneta(); // criando uma segunda caneta
		c2.modelo = "Pentel";
		c2.cor = "Azul";
		c2.ponta = 0.3F;
		c2.carga = 50;
		c2.destampar();
		c2.infoCaneta();
	}
}
