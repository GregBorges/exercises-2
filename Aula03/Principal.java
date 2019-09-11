// Aula03: Configurando visibilidade de atributos e métodos

package Aula03;

public class Principal {
	public static void main(String args[]) {
		Caneta c1 = new Caneta();  // criando uma caneta
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.7F;   ponta é um atributo privado
		c1.carga = 80;
		c1.tampada = true;
		c1.infoCaneta();
	}
}
