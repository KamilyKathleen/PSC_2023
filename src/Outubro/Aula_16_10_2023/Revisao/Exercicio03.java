// 3 - Diferencie os três comandos de repetição apresentados: while, do-while, for.

package Outubro.Aula_16_10_2023.Revisao;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 16/10/2023
 */

public class Exercicio03 {
    public static void main(String[] args) {
        /* O while é uma estrutura de repetição com teste no início, ou seja, a condição é verificada
         * antes da execução do bloco de código. É usado quando você não tem certeza de quantas vezes
         * a repetição deve ocorrer e deseja verificar a condição antes de entrar no loop.
         * */
        int numeros = 0;
        System.out.println("\nComando while: ");
        while (numeros < 10) {
            numeros ++;
            System.out.println(numeros);
        }


        /* O do-while é uma estrutura de repetição com teste no final. Isso significa que o bloco
         * de código é executado pelo menos uma vez antes que a condição seja verificada. É usado
         * quando você deseja que o bloco de código seja executado pelo menos uma vez, independentemente
         * da condição. A verificação da condição ocorre após a execução do bloco.*/
        System.out.println("\nComando do-while: ");
        numeros = 1;
        do {
            System.out.println(numeros);
            numeros++;
        } while (numeros <= 10);


        /* O for é uma estrutura de repetição que combina inicialização, teste e atualização em uma
         * única linha. É frequentemente usado quando você sabe o número exato de iterações que deseja
         * realizar. É usado quando você tem um controle preciso sobre o número de vezes que deseja
         * repetir um bloco de código.*/
        System.out.println("\nComando for: ");
        for (numeros = 1; numeros <= 10; numeros++) {
            System.out.println(numeros);
        }
    }
}
