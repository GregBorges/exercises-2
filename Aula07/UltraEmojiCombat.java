/* Aula07: Cria��o da classe lutador e dos lutadores.      *
 *														   *
 * Aula08: Agregra��o entre objetos em Java. Cria��o       *
 * da classe Luta para fazer o combate entre os Lutadores. */

package Aula07;

public class UltraEmojiCombat {
	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pretty Boy", "franc�s", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "brasileiro", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snapshadow", "estadunidense", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "australiano", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "brasileiro", 37, 1.70f, 119.3f, 5, 4, 3);
		l[5] = new Lutador("Nerdaart", "estadunidense", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[3], l[2]);
		UEC01.lutar();
		
		Luta UEC02 = new Luta();
		UEC02.marcarLuta(l[4], l[5]);
		UEC02.lutar();
	}
}
