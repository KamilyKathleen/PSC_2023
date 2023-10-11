/* 2 - Escreva um algoritmo que recebe quatro notas das avaliações do semestre e
exiba se o aluno foi aprovado, reprovado ou precisa fazer exame especial.
Aprovado → acima de 60
Reprovado → abaixo de 40
Cada avaliação → 25 pontos, no máximo
*/

package Setembro.Aula_04_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 04/09/2023
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, soma;

        System.out.println("Digite a nota da primeira avaliação: ");
        nota1 = scan.nextDouble();

        System.out.println("Digite a nota da segunda avaliação: ");
        nota2 = scan.nextDouble();

        System.out.println("Digite a nota da terceira avaliação: ");
        nota3 = scan.nextDouble();

        System.out.println("Digite a nota da quarta avaliação: ");
        nota4 = scan.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;

        if (soma >= 60){
            System.out.println("O aluno foi aprovado!");
        }
        else if (soma <= 40){
            System.out.println("O aluno foi reprovado!");
        }
        else if (soma > 40 && soma < 60){
            System.out.println("O aluno precisa fazer exame especial!");
        }
    }
}
