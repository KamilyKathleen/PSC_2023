// 1 - Crie um algoritmo para determinar se o número é ímpar

package Setembro.Aula_25_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 25/09/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        num = scan.nextInt();

        if (num % 2 != 0) {
            System.out.println("O número " + num + " é ímpar!");
        } else if (num == 0) {
            System.out.println("O número " + num + " é nulo!");
        } else {
            System.out.println("O número " + num + " não é ímpar!");
        }
    }
}
