/* 01 - */

package Outubro.Aula_23_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 23/10/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolhaUsuario = 0;

        while (escolhaUsuario != 5) {
            System.out.println("\n\nCalculadora: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            escolhaUsuario = scan.nextInt();

            if (escolhaUsuario == 1) {
                Metodos.Adicao();
            } else if (escolhaUsuario == 2) {
                Metodos.Subtracao();
            } else if (escolhaUsuario == 3) {
                Metodos.Multiplicacao();
            } else if (escolhaUsuario == 4) {
                Metodos.Divisao();
            } else if (escolhaUsuario == 5) {
                System.out.println("Obrigado por usar a calculadora.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
