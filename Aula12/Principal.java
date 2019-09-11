/* Aula12: Polimorfismo - parte 1. Este programa 
 * trata do polimorfismo de sobreposi��o */

package Aula12;

public class Principal {
	public static void main(String args[]) {
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Arara a = new Arara();
		
		/* m�todos com mesma assinatura e possuem resultados 
		 * diferentes: polimorfismo de sobreposi��o. Estes 
		 * s�o apenas alguns exemplos: */
		
		k.locomover();
		c.locomover();
		a.locomover();
		
		k.emitirSom();
		c.emitirSom();
		a.emitirSom();
	}
}
