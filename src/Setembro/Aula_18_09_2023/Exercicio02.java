/* 2 - Escreva um algoritmo capaz de receber um número da pessoa
* utilizadora e informar se o valor é positivo, negativo ou nulo
*/

package Setembro.Aula_18_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 18/09/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        System.out.println("Digite um número: ");
        num = scan.nextDouble();
        if (num > 0) {
            System.out.println("O número " + num + " é positivo!");
        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo!");
        } else {
            System.out.println("O número " + num + " é nulo!");
        }
    }
}
