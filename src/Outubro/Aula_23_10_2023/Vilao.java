/* 02 - */

package Outubro.Aula_23_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 23/10/2023
 */

/* protected - Acessível pelo
* private - Só pode ser acessado pelo próprio objeto.
* public - Acessível de qualquer lugar.
* */
public class Vilao {
    public String nome;
    public String habilidade;
    private int vida;
    public int mana;

    public void atacar() {
        System.out.println("Atacando.");
    }

    public int obterQuantidadeMana() {
        return mana;
    }

    public boolean configurarVida(int vida) {
        if (vida > 0) {
            this.vida = vida;
            return true;
        } else {
            this.vida = 0;
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome " + this.nome + " vida " + this.vida + " mana " + this.mana +
                " habilidade " + this.habilidade;
    }
}

