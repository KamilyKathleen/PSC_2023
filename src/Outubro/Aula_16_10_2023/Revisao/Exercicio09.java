// 09 - Escreva um programa em Java que lhe permita calcular o fatorial de um número dado pelo usuário.

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */


import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, fatorial = 1;

        System.out.println("Digite um número para saber seu fatorial: ");
        num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(num + "!" + " = " + fatorial);
    }
}
