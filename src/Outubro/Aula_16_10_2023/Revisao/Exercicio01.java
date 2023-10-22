// 1 - Crie um algoritmo que imprima a sequência dos 100 primeiros números pares

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Números pares de 0 à 100: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.println();
            }
        }
    }
}
