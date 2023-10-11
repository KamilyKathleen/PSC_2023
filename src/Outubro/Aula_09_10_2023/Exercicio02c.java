/* 2 - Crie um algoritmo capaz de imprimir o tamanho de um triângulo invertido,
que é definido por quem utiliza, limite 10x10.
  c) triângulo invertido
     *  *  *  *
     *  *  *
     *  *
     *
* */

package Outubro.Aula_09_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 09/10/2023
 */

import java.util.Scanner;

public class Exercicio02c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoTrianguloInvertido, i, j;

        System.out.println("Digite o tamanho do triângulo: ");
        tamanhoTrianguloInvertido = scan.nextInt();

        if (tamanhoTrianguloInvertido > 10 || tamanhoTrianguloInvertido <= 0) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            for (i = tamanhoTrianguloInvertido - 1; i >= 0; i--) {
                for (j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
