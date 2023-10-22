/* 06 - Seu algoritmo deve ler o sexo e a idade de uma população de 20 pessoas, e, em seguida,
informar a média de idade da população masculina e a população feminina.*/

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalIdadeMasculino = 0, totalIdadeFeminino = 0, idade;
        int contadorMasculino = 0, contadorFeminino = 0;
        double mediaIdadeMasculino, mediaIdadeFeminino;
        char sexo;

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o sexo (M/F): ");
            sexo = Character.toLowerCase(scan.next().charAt(0));

            if (sexo == 'm' || sexo == 'f') {
                System.out.println("Informe a idade: ");
                idade = scan.nextInt();

                if (sexo == 'm') {
                    totalIdadeMasculino += idade;
                    contadorMasculino++;
                } else {
                    totalIdadeFeminino += idade;
                    contadorFeminino++;
                }

            } else {
                System.out.println("Opção inválida! Digite 'M' ou 'F'.");
                i--;
            }
        }

        if (contadorMasculino > 0) {
            mediaIdadeMasculino = (double) totalIdadeMasculino / contadorMasculino;
        } else {
            mediaIdadeMasculino = 0;
        }

        if (contadorFeminino > 0) {
            mediaIdadeFeminino = (double) totalIdadeFeminino / contadorFeminino;
        } else {
            mediaIdadeFeminino = 0;
        }

        System.out.println("Média de idade masculina: " + mediaIdadeMasculino);
        System.out.println("Média de idade feminina: " + mediaIdadeFeminino);
    }
}
