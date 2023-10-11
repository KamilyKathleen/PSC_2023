/* 3 - Faça um algoritmo para determinar o sucesso de um determinado aluno na disciplina de
 * programação. Deve-se exibir a pergunta:
 * "Você estudou algoritmos no final de semana?"
 * A resposta deve ser sim ou não e, a saída, será:
 * - "Parabéns" → se a resposta for sim;
 * - "Você precisa se esforçar mais" → se a resposta for não;
 * - "Impossível determinar" → se a resposta for diferente do esperado.
 * */

package Setembro.Aula_25_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 25/09/2023
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;

        System.out.println("Você estudou algoritmos no final de semana? Digite sim ou não: ");
        resposta = scan.nextLine();

        if (resposta.trim().equalsIgnoreCase("sim")) {
            System.out.println("Parabéns!");
        } else if (resposta.trim().equalsIgnoreCase("não")) {
            System.out.println("Você precisa se esforçar mais.");
        } else {
            System.out.println("Impossível determinar.");
        }
    }
}
