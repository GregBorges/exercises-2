/* Aula10: Heran�a - parte 1. Este programa tem o 
 * objetivo de demonstrar o caso de heran�a*/

package Aula10;

public class Principal {
	public static void main(String args[]) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		
		p1.setIdade(43);
		p2.setIdade(18);
		p3.setIdade(25);
		p4.setIdade(60);
		
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p1.info();
		p2.info();
		p3.info();
		p4.info();
	}
}
