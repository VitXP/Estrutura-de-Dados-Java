package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    // 1.  Escreva um programa que leia 7 números e armazene-os em um vetor. Depois, o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos. E depois, deve percorrer o vetor de trás para frente, exibindo os números na ordem inversa em que foram inseridos (dica: utilize o for ao contrário).

    public static void main(String[] args) {
        //Criação do objeto Leitor
        Scanner leitor = new Scanner(System.in);

        // Declaração e criação de um vetor de tamanho 7
        int[] vetor = new int[7];

        // Exibir
        System.out.println("\nDigite 7 Números 🔢");
        for (int i = 0; i < 7; i++) {
            System.out.println("Número: " + (i + 1));
            vetor[i] = leitor.nextInt();
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(vetor));

        // Exibir ao contrário
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + "\t");
        }

    }
}
