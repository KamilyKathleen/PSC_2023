/* 1 - Escreva um algoritmo para imprimir a sequência de um até cem, usando todos os
 * comandos de repetição.
 * */

package Outubro.Aula_02_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 02/10/2023
 */

public class Exercicio01 {
    public static void main(String[] args) {
        int numeros = 0;

        System.out.println("Loop while: ");
        while (numeros < 100) {
            numeros ++;
            System.out.println(numeros);
        }

        System.out.println("\nLoop do-while: ");
        numeros = 1;
        do {
            System.out.println(numeros);
            numeros++;
        } while (numeros <= 100);

        System.out.println("\nLoop for: ");
        for (numeros = 1; numeros <= 100; numeros++) {
            System.out.println(numeros);
        }
    }
}
