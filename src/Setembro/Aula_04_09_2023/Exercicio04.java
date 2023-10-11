// 4 - Crie um algoritmo para calcular o troco de uma compra.

package Setembro.Aula_04_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 04/09/2023
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double total, recebido, troco;

        System.out.print("Digite o valor total da compra: R$ ");
        total = scan.nextDouble();
        System.out.print("Digite o valor recebido: R$ ");
        recebido = scan.nextDouble();
        troco = recebido - total;
        System.out.print("O seu troco será de: R$ " + troco);
    }
}
