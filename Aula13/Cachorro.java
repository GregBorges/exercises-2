package Aula13;

public class Cachorro extends Lobo {
	// métodos
	@Override
	public String emitirSom() {
		return ("Au!Au!Au!");
	}
	
		// reage dependendo da frase
	public String reagir(String frase) {
		if (frase.equals("toma comida") || frase.equals("Olá")) 
			return ("Abanar e latir");
		return ("Rosnar");
	}
	
		// reage dependendo da hora
	public String reagir(int hora, int min) {
		if (hora < 12) 
			return ("Abanar");
		else if (hora >= 18) 
			return ("Ignorar");
		return ("Abanar e latir");
	}
	
		// reage dependendo se for o dono ou não
	public String reagir(boolean dono) {
		if (dono) 
			return ("Abanar");
		return ("Rosnar e latir");
	}
	
		// reage dependendo da idade e do peso
	public String reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) 
				return ("Abanar");
			return ("Latir");
		}
		else {
			if (peso < 10) 
				return ("Rosnar");
			return ("Ignorar");
		}
	} 
}
