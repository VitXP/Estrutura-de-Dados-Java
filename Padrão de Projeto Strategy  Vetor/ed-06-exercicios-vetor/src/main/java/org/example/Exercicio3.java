package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    //3.  Escreva um programa que cria um vetor para armazenar 10 Strings. O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor. Depois, o programa deve pedir que se digite um nome qualquer. O programa deverá pesquisar se esse nome está no vetor. Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”, sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.

    public static void main(String[] args) {

        //Criação do objeto Leitor
        Scanner leitor = new Scanner(System.in);

        //Criação variável nomeBuscar
        String nomeBuscar;

        //Contador
        int contador = 0;

        // Declaração e criação de um vetor de tamanho 10
        String[] vetor = new String[10];

        // Exibir
        System.out.println("\nDigite 10 nomes 👩");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + (i + 1));
            vetor[i] = leitor.nextLine();
        }

        // DigitarNome
        System.out.println("\nDigite 1 nome para buscar 👦");
        nomeBuscar = leitor.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nomeBuscar)) {
                System.out.println("Nome encontrado no índice " + i);
                contador++;
            }
        }

        if (contador <= 0) {
            System.out.println("Nome não encontrado");
        }

    }
}
