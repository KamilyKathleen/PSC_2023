// 2 - Escreva um programa que leia um número e imprima os dez primeiros múltiplos.

package Outubro.Aula_02_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 02/10/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, multiplicador, resultado;
        multiplicador = 1;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        do {
            resultado = num * multiplicador;
            System.out.println(num + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        } while (multiplicador<=10);
    }
}
