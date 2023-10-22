// 10 - Escreva um algoritmo que imprima os n primeiros números da sequência de Fibonacci.

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio10 {
    static void Fibonacci(int numeroUsuario) {
        int num1 = 0, num2 = 1, contador = 0;

        while (contador < numeroUsuario) {
            System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            contador += 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUsuario;

        System.out.println("Digite quantos números da sequência Fibonacci deseja ver: ");
        numeroUsuario = scan.nextInt();

        Fibonacci(numeroUsuario);
    }
}
