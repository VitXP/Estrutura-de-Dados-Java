package org.example;

import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {

        // Variável Menu
        int opcao;

        // Variável Produto
        Integer codigo;
        Double preco;

        // Variável Livro
        String nomeLivro;
        String autorLivro;
        String isbnLivro;

        // Variável DVD
        String nomeGravadora;
        String nomeProdutora;

        // Variável Serviço
        String descricao;
        Integer quantHoras;
        Double valorHora;

        //Iniciando carrinho
        Carrinho carrinho = new Carrinho();

        //Scanner
        Scanner letras = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("\n-- Seja Bem-Vindo! 🛒 --");
        do {
            System.out.println("\nDigite a opcao desejada:\n");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Servico");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir Total de Venda");
            System.out.println("6. Fim");
            opcao = numeros.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o codigo do livro:");
                    codigo = numeros.nextInt();

                    System.out.println("Digite o preço do livro:");
                    preco = numeros.nextDouble();

                    System.out.println("Digite o nome do livro:");
                    nomeLivro = letras.nextLine();

                    System.out.println("Digite o Autor do livro:");
                    autorLivro = letras.nextLine();

                    System.out.println("Digite o ISBN do livro:");
                    isbnLivro = letras.nextLine();

                    Livro livro = new Livro(codigo, preco, nomeLivro, autorLivro, isbnLivro);
                    carrinho.adicionaVendavel(livro);
                    System.out.println("Livro Adicionado 📚");
                    break;

                case 2:
                    System.out.println("Digite o codigo do DVD:");
                    codigo = numeros.nextInt();

                    System.out.println("Digite o preço do DVD:");
                    preco = numeros.nextDouble();

                    System.out.println("Digite o nome do DVD:");
                    nomeGravadora = letras.nextLine();

                    System.out.println("Digite a gravadora do DVD:");
                    nomeProdutora = letras.nextLine();

                    DVD dvd = new DVD(codigo, preco, nomeGravadora, nomeProdutora);
                    carrinho.adicionaVendavel(dvd);
                    System.out.println("DVD Adicionado ao carrinho 💿");
                    break;
                case 3:
                    System.out.println("Digite a descrição do serviço:");
                    descricao = letras.nextLine();

                    System.out.println("Digite o Codigo do serviço:");
                    codigo = numeros.nextInt();

                    System.out.println("Digite a quantidade de horas do serviço:");
                    quantHoras = numeros.nextInt();

                    System.out.println("Digite o valor por hora do serviço:");
                    valorHora = numeros.nextDouble();

                    Servico servico = new Servico(descricao, codigo, quantHoras, valorHora);
                    carrinho.adicionaVendavel(servico);
                    System.out.println("Servico Adicionado ao carrinho 🧑‍💻");
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println(String.format("\nO total de vendas foi %.2f 💵", carrinho.calculaTotalVenda()));
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Número inválido, digite novamente! :(");
            }

        } while (opcao != 6);
        System.out.println("Fim");

    }
}