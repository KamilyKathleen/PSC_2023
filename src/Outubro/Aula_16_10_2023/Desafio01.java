/* 1 - Imprima a seguinte imagem:

 *  *  *  *
    *  *  *
       *  *
          *

*/

package Outubro.Aula_16_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoTriangulo, i, j;

        System.out.println("Digite o tamanho do triângulo: ");
        tamanhoTriangulo = scan.nextInt();

        if (tamanhoTriangulo > 10 || tamanhoTriangulo <=0) {
            System.out.println("Número inválido! Digite um número entre 1 e 10.");
        } else {
            for (i = tamanhoTriangulo; i <= 0; i++) {
                for (j = 0; j <= i; j--) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
