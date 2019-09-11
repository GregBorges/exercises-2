// Aula04: métodos especiais - métodos getters, setters e construtor

package Aula04;

public class Principal {
	public static void main(String[] args) {
		Caneta c1 =  new Caneta("BIC", "Preta", 0.6F);
		c1.infoCaneta();
		
		Caneta c2 = new Caneta("Pentel", "Azul", 0.3F);
		c2.infoCaneta();
	}
}
