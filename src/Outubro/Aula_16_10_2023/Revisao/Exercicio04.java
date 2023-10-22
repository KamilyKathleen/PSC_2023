/* 04 - Imprima a seguinte figura:
     *
     *  *
     *  *  *
     *  *  *  *
   A altura deve ser determinada pelo usuário. (não ultrapasse 20 linhas).
 */
package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tamanhoTriangulo, i, j;

        System.out.println("Digite o tamanho do triângulo: ");
        tamanhoTriangulo = scan.nextInt();

        if (tamanhoTriangulo > 20 || tamanhoTriangulo <= 0) {
            System.out.println("Número inválido! Digite um número entre 1 e 20.");
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
