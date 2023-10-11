// 2 - Faça um programa que determine se o quadrilátero é ou não um quadrado

package Setembro.Aula_25_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 25/09/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lado1, lado2, lado3, lado4;

        System.out.println("Digite a medida do primeiro lado do quadrilátero: ");
        lado1 = scan.nextInt();

        System.out.println("Digite a medida do segundo lado do quadrilátero: ");
        lado2 = scan.nextInt();

        System.out.println("Digite a medida do terceiro lado do quadrilátero: ");
        lado3 = scan.nextInt();

        System.out.println("Digite a medida do quarto lado do quadrilátero: ");
        lado4 = scan.nextInt();

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            System.out.println("O quadrilátero é um quadrado!");
        } else {
            System.out.println("O quadrilátero não é um quadrado!");
        }
    }
}
