/* 1 - Construa um algoritmo capaz de imprimir a sequência decrescente
 * a partir de um número informado, limite - zero.
 * */

package Outubro.Aula_09_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 09/10/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroInformado, i;

        System.out.println("Digite um número: ");
        numeroInformado = scan.nextInt();

        if (numeroInformado < 0) {
            System.out.println("Número inválido! Por favor, digite um número positivo.");
        } else if (numeroInformado == 0) {
            System.out.println("Número inválido! Por favor, digite um número maior que 0.");
        } else {
            System.out.println("\nSequência decrescente: ");
            for (i = numeroInformado; i >=0; i--) {
                System.out.println(i);
            }
        }
    }
}
