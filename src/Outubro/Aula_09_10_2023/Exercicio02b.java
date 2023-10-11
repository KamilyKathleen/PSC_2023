/* 2 - Crie um algoritmo capaz de imprimir o tamanho de um triângulo,
que é definido por quem utiliza, limite 10x10.
  b) triângulo
     *
     *  *
     *  *  *
     *  *  *  *
* */

package Outubro.Aula_09_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 09/10/2023
 */

import java.util.Scanner;

public class Exercicio02b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoTriangulo, i, j;

        System.out.println("Digite o tamanho do triângulo: ");
        tamanhoTriangulo = scan.nextInt();

        if (tamanhoTriangulo > 10 || tamanhoTriangulo <= 0) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            for (i = 1; i <= tamanhoTriangulo; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
