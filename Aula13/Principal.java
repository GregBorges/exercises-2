/* Aula13: Polimorfismo - parte 2. Este programa 
 * trata do polimorfismo de sobrecarga */

package Aula13;

public class Principal {
	public static void main(String args[]) {

		Cachorro c = new Cachorro();
		
		// passando uma String como par�metro
		System.out.println(c.reagir("Ol�"));
		System.out.println(c.reagir("Vai apanhar"));
		System.out.println("");
		
		// passando dois inteiros como par�metro
		System.out.println(c.reagir(11, 45));
		System.out.println(c.reagir(21, 00));
		System.out.println("");
		
		// passando um valor l�gico como par�metro
		System.out.println(c.reagir(true));
		System.out.println(c.reagir(false));
		System.out.println("");
		
		// passando um inteiro e um float como par�metro
		System.out.println(c.reagir(2, 12.5f));
		System.out.println(c.reagir(17, 4.5f));
	}
}
