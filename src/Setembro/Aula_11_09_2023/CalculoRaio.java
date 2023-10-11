/*
 * Faça um algoritmo para calcular o volume de uma esfera de raio R,
 * onde R é fornecido pela pessoa utilizadora.
 * O volume é calculado com: V = 4/3 pi R^3
 */

package Setembro.Aula_11_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 11/09/2023
 */

import java.util.Scanner;

public class CalculoRaio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double volume, raio;

        System.out.println("Digite o raio da esfera: ");
        raio = scan.nextDouble();
        volume = (4 * 3.1415 * (raio * raio * raio)) / 3;
        System.out.print("O volume da esfera é: " + volume);
    }
}

/*
double pi = 3.1415;
public Double volume(double, raio) {
    return (pi * (raio * raio * raio) * (4.0 / 3.0));
}
*/
