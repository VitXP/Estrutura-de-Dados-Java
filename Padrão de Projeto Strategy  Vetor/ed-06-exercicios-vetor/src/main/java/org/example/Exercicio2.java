package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    //2.  Escreva um programa que cria um vetor para armazenar 10 inteiros. O programa deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse vetor. O programa deverá calcular a média dos números digitados e exibir a média. Depois, deverá exibir os números que estão no vetor que estão acima da média.

    public static void main(String[] args) {
        //Criação do objeto Leitor
        Scanner leitor = new Scanner(System.in);

        //Criação variável média
        int media = 0;

        // Declaração e criação de um vetor de tamanho 10
        int[] vetor = new int[10];

        // Exibir
        System.out.println("\nDigite 10 Números 🔢");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + (i + 1));
            vetor[i] = leitor.nextInt();
            media += vetor[i];
        }

        media = media / 10;

        System.out.println("\n");
        System.out.println("🔢 A média foi: " + media);

        for (int s : vetor) {
            if (s > media) {
                System.out.print(s + "\t");
            }
        }

    }
}
