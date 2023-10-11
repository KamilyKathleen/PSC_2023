// 3 - Crie um algoritmo capaz de exibir o quadrado de um número lido externamente.

package Setembro.Aula_04_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 04/09/2023
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num, quadrado;

        System.out.println("Digite um número para saber o seu quadrado: ");
        num = scan.nextInt();
        quadrado = num * num;
        System.out.println("O quadrado do número " + num + " é: " + quadrado);
    }
}
