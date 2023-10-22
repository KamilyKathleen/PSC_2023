/* 07 - Crie um algoritmo que calcule o IMC de uma pessoa, para isso, você deve coletar
a altura e o peso do mesmo. Pesquise na internet como o cálculo é realizado, lembre-se
de desprezar a diferença entre sexos. Para cada intervalo do IMC existe uma classificação,
ela deve ser exibida por seu algoritmo, junto com uma mensagem informativa ao usuário.*/

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Calculadora de IMC");

        System.out.println("Digite o seu peso em quilogramas: ");
        peso = scan.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Seu imc é: " + imc + ".");

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu peso está na faixa normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está com obesidade de grau I.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Você está com obesidade de grau II.");
        } else {
            System.out.println("Você está com obesidade de grau III.");
        }
    }
}
