// 08 - Os números primos existentes entre os 100 primeiros números naturais não nulos.

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

public class Exercicio08 {
    public static void main(String[] args) {
        int numerosPrimos = 100, contador;

        System.out.println("Números primos de 1 à 100: ");

        for (int i = 1; i <= numerosPrimos; i++) {
            contador = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    contador++;
                    break;
                }
            }

            if (contador == 0) {
                System.out.println(i);
            }
        }
    }
}
