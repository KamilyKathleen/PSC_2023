// 1 - Crie um algoritmo capaz de dizer se um número é nulo ou não

package Setembro.Aula_18_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 18/09/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int num;
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if (num != 0) {
                System.out.println("O número " + num + " não é nulo!");
            } else {
                System.out.println("O número " + num + " é nulo!");
            }
            scan.nextLine();
        }
    }
}
