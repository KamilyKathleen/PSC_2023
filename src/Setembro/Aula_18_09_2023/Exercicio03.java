/* 3 - Você foi contratado para trabalhar na BHTrans e, sua primeira atividade
        é determinar qual taxa aplicar na multa por excesso de velocidade;
        A velocidade da via deve ser informada, assim como a velocidade do veículo;
        Taxas de acordo com a velocidade:
        * Acima de 10% → R$500
        * Acima de 20% → R$850
        * Acima de 50% → R$3000 + apreensão da carteira
*/

package Setembro.Aula_18_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 18/09/2023
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocidadeVia, velocidadeVeiculo, excessoVelocidade , multa;

        System.out.println("Digite qual a velocidade máxima da via: ");
        velocidadeVia = scan.nextDouble();

        System.out.println("Digite a velocidade do veículo: ");
        velocidadeVeiculo = scan.nextDouble();

        excessoVelocidade = ((velocidadeVeiculo - velocidadeVia) * 100) / velocidadeVia;

        if (excessoVelocidade > 10 && excessoVelocidade <= 20) {
            multa = 500;
            System.out.println("Velocidade máxima permitida na via: " + velocidadeVia + " Km/h");
            System.out.println("Velocidade do veículo: " + velocidadeVeiculo + " Km/h");
            System.out.println("Excesso de velocidade: " + excessoVelocidade + "%");
            System.out.println("O veículo estava aproximadamente 10% acima da velocidade permitida. " +
                    "Será aplicada uma multa de R$ " + multa);
        } else if (excessoVelocidade > 20 && excessoVelocidade <= 50) {
            multa = 850;
            System.out.println("Velocidade máxima permitida na via: " + velocidadeVia + " Km/h");
            System.out.println("Velocidade do veículo: " + velocidadeVeiculo + " Km/h");
            System.out.println("Excesso de velocidade: " + excessoVelocidade + "%");
            System.out.println("O veículo estava aproximadamente 20% acima da velocidade permitida. " +
                    "Será aplicada uma multa de R$ " + multa);
        } else if (excessoVelocidade > 50) {
            multa = 3000;
            System.out.println("Velocidade máxima permitida na via: " + velocidadeVia + " Km/h");
            System.out.println("Velocidade do veículo: " + velocidadeVeiculo + " Km/h");
            System.out.println("Excesso de velocidade: " + excessoVelocidade + "%");
            System.out.println("O veículo estava aproximadamente 50% acima da velocidade permitida. " +
                    "Será aplicada uma multa de R$ " + multa + " e a CNH será apreendida.");
        } else {
            System.out.println("Velocidade máxima permitida na via: " + velocidadeVia + " Km/h");
            System.out.println("Velocidade do veículo: " + velocidadeVeiculo + " Km/h");
            System.out.println("Excesso de velocidade: " + excessoVelocidade + "%");
            System.out.println("O veículo não ultrapassou 10% do limite da via. " +
                    "Não será aplicada multa.");
        }
    }
}
