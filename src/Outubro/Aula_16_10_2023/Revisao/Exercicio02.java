/* 2 - Crie um algoritmo que imprima a tabuada de multiplicação de um número dado pelo usuário
 * (e.g., se o usuário informar o número 10, deve-se exibir a multiplicação do 1
 * até o 10, no mesmo formato da tabuada)
 */

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, i = 1;

        System.out.println("Digite um número para saber sua tabuada: ");
        num = scan.nextInt();
        System.out.println("\nTabuada do " + num);

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
