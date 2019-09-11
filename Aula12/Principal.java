/* Aula12: Polimorfismo - parte 1. Este programa 
 * trata do polimorfismo de sobreposição */

package Aula12;

public class Principal {
	public static void main(String args[]) {
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Arara a = new Arara();
		
		/* métodos com mesma assinatura e possuem resultados 
		 * diferentes: polimorfismo de sobreposição. Estes 
		 * são apenas alguns exemplos: */
		
		k.locomover();
		c.locomover();
		a.locomover();
		
		k.emitirSom();
		c.emitirSom();
		a.emitirSom();
	}
}
