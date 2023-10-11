/* 5 - Em determinado jogo, a espaçonave deve disparar no asteroide mais próximo.
 * Escreva um programa que leia a distância de dois asteroides e, dispare
 * naquele que estiver mais perto.
 * */

package Setembro.Aula_25_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 25/09/2023
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int asteroideA, asteroideB;

        System.out.println("Digite a distância do Asteroide A para a espaçonave: ");
        asteroideA = scan.nextInt();

        System.out.println("Digite a distância do Asteroide B para a espaçonave: ");
        asteroideB = scan.nextInt();

        if (asteroideA < asteroideB) {
            System.out.println("Dispare no Asteroide A!");
        } else if (asteroideB < asteroideA) {
            System.out.println("Dispare no Asteroide B!");
        } else {
            System.out.println("Os asteroides estão a distâncias iguais da espaçonave.");
        }
    }
}
