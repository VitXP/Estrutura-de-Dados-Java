package org.example;

import java.util.Scanner;

public class Exercicio4 {
    //4.  Elaborar um programa que solicita que o usuário digite 10 valores inteiros e armazene esses valores em um vetor. Depois o programa deve solicitar que o usuário digite um número qualquer e o programa deverá exibir quantas vezes esse número ocorre no vetor. Exemplo:  considere os números 3  7  9  3  7  1  3  3  5  8 o número 7 ocorre 2 vezes o número 3 ocorre 4 vezes o número 2 não ocorre nenhuma vez.

    public static void main(String[] args) {
        //Criação do objeto Leitor
        Scanner leitor = new Scanner(System.in);

        //Variável buscarNumero
        int numeroBuscar = 0;

        //Contador
        int contador = 0;

        // Declaração e criação de um vetor de tamanho 10
        int[] vetor = new int[10];

        // Exibir
        System.out.println("\nDigite 10 Números 🔢");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: " + (i + 1));
            vetor[i] = leitor.nextInt();
        }

        // Digitar Número
        System.out.println("\nDigite 1 número para buscar 🔢");
        numeroBuscar = leitor.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == (numeroBuscar)) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("o número " + numeroBuscar + " ocorre " + contador + " vezes");
        } else {
            System.out.println("o número " + numeroBuscar + " não ocorre nenhuma vez.");
        }

    }
}
