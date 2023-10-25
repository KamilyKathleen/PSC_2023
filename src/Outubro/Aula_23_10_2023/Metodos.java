package Outubro.Aula_23_10_2023;

import java.util.Scanner;

public class Metodos {
    public static void Adicao() {
        Scanner scan = new Scanner(System.in);
        int a, b, resultado;

        System.out.println("Digite um número: ");
        a = scan.nextInt();
        System.out.println("Digite outro número: ");
        b = scan.nextInt();

        resultado = a + b;
        System.out.println(a + " + " + b + resultado);
    }

    public static void Subtracao() {
        Scanner scan = new Scanner(System.in);
        int a, b, resultado;

        System.out.println("Digite um número: ");
        a = scan.nextInt();
        System.out.println("Digite outro número: ");
        b = scan.nextInt();

        resultado = a - b;
        System.out.println(a + " - " + b + resultado);
    }

    public static void Multiplicacao() {
        Scanner scan = new Scanner(System.in);
        int a, b, resultado;

        System.out.println("Digite um número: ");
        a = scan.nextInt();
        System.out.println("Digite outro número: ");
        b = scan.nextInt();

        resultado = a * b;
        System.out.println(a + " * " + b + resultado);
    }

    public static void Divisao() {
        Scanner scan = new Scanner(System.in);
        int a, b, resultado;

        System.out.println("Digite um número: ");
        a = scan.nextInt();
        System.out.println("Digite outro número: ");
        b = scan.nextInt();

        resultado = a / b;
        System.out.println(a + " / " + b + resultado);
    }
}
