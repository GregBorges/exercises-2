/* Aula11: Herança - parte 2. Este programa tem o 
 * objetivo de demonstrar o caso de herança de herança. */

package Aula11;

public class Principal {
	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Alvarez");
		v1.setIdade(46);
		v1.setSexo("M");
		
		Professor p1 = new Professor();
		p1.setNome("Carlinhos");
		p1.setIdade(75);
		p1.setSexo("M");
		p1.setEspecialidade("Eletrônica");
		p1.setSalario(5073.50f);
		p1.receberAumento(32.61f);
		
		Aluno a1 = new Aluno();
		a1.setNome("Jubilei");
		a1.setMatricula(9235729);
		a1.setCurso("Medicina");
		a1.setIdade(24);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Fernando");
		b1.setMatricula(135246);
		b1.setCurso("Arquitetura e Urbanismo");
		b1.setIdade(20);
		b1.setSexo("M");
		b1.setBolsa(0012);
		b1.pagarMensalidade();
		b1.renovarBolsa();
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Gabriel");
		t1.setIdade(16);
		t1.setSexo("M");
		t1.setMatricula(593205);
		t1.setCurso("Elétrica");
		t1.setRegistroProfissional(454366789);
		t1.praticar();
		t1.pagarMensalidade();
	}
}
