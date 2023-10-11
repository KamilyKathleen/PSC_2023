/* 4 - Crie um jogo de adivinhação. A pessoa utilizadora terá 3 chances, e deverá informar
 * um valor entre um e dez. O jogo deve informar se o valor inserido é menor ou maior
 * do que o número secreto. Se o valor estiver correto, exibir a mensagem: Parabéns!
 * */

package Outubro.Aula_02_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 02/10/2023
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void dica(int numeroCerto, int palpiteUsuario) {
        if (palpiteUsuario < numeroCerto) {
            System.out.println("Seu palpite é menor que o número correto.");
        } else if (palpiteUsuario > numeroCerto) {
            System.out.println("Seu palpite é maior que o número correto.");
        } else {
            System.out.println("Parabéns, você acertou!");
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroCerto = 7, palpiteUsuario, i = 0;

        System.out.println("Jogo de Adivinhação");
        System.out.println("Você terá três chances de adivinhar o número correto.");

        do {
            System.out.println("\nDigite um número de 1 a 10: ");
            palpiteUsuario = scan.nextInt();
            i++;
            dica(numeroCerto, palpiteUsuario);
            if (i >= 3 && palpiteUsuario != numeroCerto) {
                System.out.println("\n\nSuas chances acabaram.");
                System.out.println("O número correto era " + numeroCerto + ".");
                break;
            }
        } while (palpiteUsuario != numeroCerto);
    }
}
