/* Aula05: Exemplo prático do que foi aprendido até o momento. 
 * Este programa representa um banco, o qual realiza as operações 
 * básicas que todo banco faz*/

package Aula05;

public class Principal {
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11112);
		p1.setDono("Jubileu");
		p1.abrirConta("CP");
		p1.depositar(402);
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(12345);
		p2.setDono("Creuza");
		p2.abrirConta("CC");
	
		p1.estadoAtual();
		p2.estadoAtual();
	}
}
