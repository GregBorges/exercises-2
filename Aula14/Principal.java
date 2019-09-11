//Aula14: Projeto final - simulação Youtube

package Aula14;

public class Principal {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de HTML5");
		v[2] = new Video("Aula 31 de PHP");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		Visualizacao vis[] = new Visualizacao[3];
		
		vis[0] = new Visualizacao (g[0], v[1]);
		vis[0].avaliar(8);
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao (g[0], v[2]);
		vis[1].avaliar(47.0f);
		System.out.println(vis[1].toString());
		
		vis[2] = new Visualizacao (g[1], v[1]);
		vis[2].avaliar();
		vis[2].getFilme().like();
		System.out.println(vis[2].toString());
	}
}
