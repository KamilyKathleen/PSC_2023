/* 4 - A loja ABC possui uma política de descontos para pagamento em Pix. Se esta modalidade
 * for selecionada, serão aplicados 10% de desconto;
 * Solicite o valor da compra e exiba o valor final, com o desconto.
 * */

package Setembro.Aula_25_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 25/09/2023
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalCompra, desconto, valorFinal;
        String resposta;

        System.out.println("A compra será realizada por PIX? Digite sim ou não: ");
        resposta = scan.nextLine();

        if (resposta.trim().equalsIgnoreCase("sim")) {
            System.out.print("Digite o valor total da compra: R$ ");
            totalCompra = scan.nextDouble();
            desconto = totalCompra * 10 / 100;
            valorFinal = totalCompra - desconto;
            System.out.println("O valor da compra com 10% de desconto será: R$ " + valorFinal);
        }
        else if (resposta.trim().equalsIgnoreCase("não")) {
            System.out.print("Digite o valor total da compra: R$ ");
            totalCompra = scan.nextDouble();
            System.out.println("O valor final da compra será R$ " + totalCompra + " e não haverá desconto.");
        }
        else {
            System.out.println("Resposta inválida! Tente novamente.");
        }
    }
}
