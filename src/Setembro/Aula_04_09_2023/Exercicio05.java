/* 5 - Algoritmo para converter de Celsius para Farenheit.
 *  Fórmula → F = (9 * C + 160) / 5
 */

package Setembro.Aula_04_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 04/09/2023
 */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double farenheit, celsius;

        System.out.println("Digite a temperatura em Celsius para convertê-la em Farenheit: ");
        celsius = scan.nextDouble();
        farenheit = (9 * celsius + 160) / 5;
        System.out.print("A temperatura em Farenheit é : " + farenheit);
    }
}
