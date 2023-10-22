/* 05 - Altere o algoritmo anterior, caso ainda não tenha feito, para que ele impeça o usuário de
 * informar valores negativos, ou, valores acima de 20. Quando isso acontecer o usuário deve ser
 * informado do erro, e perguntado se deseja ou não continuar.
*/
package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoTriangulo, i, j;
        String respostaUsuario;

        System.out.println("Digite o tamanho do triângulo: ");
        tamanhoTriangulo = scan.nextInt();

        if (tamanhoTriangulo > 20 || tamanhoTriangulo <= 0) {
            System.out.println("Número inválido! Deseja continuar? S ou N: ");
            respostaUsuario = scan.next();

            if (respostaUsuario.equalsIgnoreCase("s")) {
                System.out.println("Digite um número entre 1 e 20: ");
                tamanhoTriangulo = scan.nextInt();
                for (i = 1; i <= tamanhoTriangulo; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Obrigado por usar o sistema!");
            }

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
