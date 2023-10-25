package Outubro.Aula_23_10_2023;

import java.util.Scanner;

public class Vilao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vilao vilao1; // variavel que armazena o objeto vilao

        vilao1 = new Vilao();
        vilao1.nome = "Floquinho";
        vilao1.mana = 100;
        vilao1.configurarVida(100);
        vilao1.habilidade = "Fogo";

        System.out.println(vilao1);
    }
}
