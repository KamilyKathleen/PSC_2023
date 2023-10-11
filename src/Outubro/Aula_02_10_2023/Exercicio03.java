/* 3 - Crie um algoritmo para calcular a potenciação.
 * Entrada: base e expoente; saída o resultado da potenciação. Exemplo:
 * Base = 2
 * Expoente = 4
 * Resposta = 16
 * */

package Outubro.Aula_02_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 02/10/2023
 */

import java.util.Scanner;

//import java.lang.Math;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, expoente, resultado = 1, i;

        System.out.println("Calculadora de potenciação.");
        System.out.println("Digite um número para ser a base da potência: ");
        base = scan.nextInt();

        System.out.println("Digite um número para ser o expoente da potência: ");
        expoente = scan.nextInt();

        if (expoente == 0 && base == 0) {
            System.out.println("Inválido!");
        } else if (expoente == 0) {
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado + ".");
        } else if (base == 0) {
            resultado = 0;
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado + ".");
        } else {
            for (i = expoente; i >= 1; i--) {
                resultado = resultado * base;
            }
            System.out.println(base + " elevado a " + expoente + " é igual a " + resultado + ".");
        }

        /*System.out.println("O número " + base + " elevado a " + expoente + " é igual a " +
                Math.pow(base, expoente));*/
    }
}
