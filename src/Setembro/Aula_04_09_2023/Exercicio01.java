// 1 - Escreva um algoritmo capaz de ler dois números e exibir a média aritmética.

package Setembro.Aula_04_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 04/09/2023
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2, media;

        System.out.println("Digite um número: ");
        num1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        num2 = scan.nextInt();
        media = (num1 + num2)/2;
        System.out.println("A média aritmética dos números digitados é: " + media);
    }
}
