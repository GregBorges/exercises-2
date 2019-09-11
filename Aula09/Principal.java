//Aula09: Exercício

package Aula09;

public class Principal {
	public static void main(String args[]) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
		p[0] = new Pessoa("João", 20, "M");
		p[1] = new Pessoa("Maria", 23, "F");
		
		l[0] = new Livro("Aprendendo a Programar", "Carlos Antonio", 302, p[0]);
		l[1] = new Livro("História do Brasil", "Cabral", 1500, p[1]);
		l[2] = new Livro("Aprendendo Python", "Ana Diz", 593, p[0]);
		
		l[0].abrir();
		l[0].folhear(40);
		l[0].voltarPag();
		
		l[0].detalhes();
		l[1].detalhes();
		l[2].detalhes();
	}
}
