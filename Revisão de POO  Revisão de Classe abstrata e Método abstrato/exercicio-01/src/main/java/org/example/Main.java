package org.example;

public class Main {
    public static void main(String[] args) {

        // Adicionando Objetos
        AlunoFundamental alunoFundamental =  new AlunoFundamental(10203, "Alana", 9.8,7.0,6.9,10.9);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(22045, "Victor", 5.6, 7.8);
        AlunoPos alunoPos = new AlunoPos(33465, "Marise", 2.3, 3.4, 2.5);

        Escola escola = new Escola("Negrini");

        System.out.printf("\nCadastrando Alunos\n");
        escola.adicionaAluno(alunoFundamental);
        escola.adicionaAluno(alunoGraduacao);
        escola.adicionaAluno(alunoPos);
        System.out.println("\n");

        System.out.printf("Exibindo Todos os alunos");
        escola.exibeTodos();

        System.out.printf("\n\n\nExibindo Todos os alunos da graduação");
        escola.exibeAlunosGraduacao();

        System.out.printf("\n\n\nTeste calculando a média\n");
        System.out.println(alunoFundamental.calculaMedia());
        System.out.println(alunoPos.calculaMedia());
        System.out.println(alunoGraduacao.calculaMedia());

        System.out.println("\n\nExibindo apenas os alunos aprovados");
        escola.exibeAprovado();

        System.out.println("\n");
        System.out.println("Localizar Aluno");
        escola.buscaAluno(334625);
        System.out.println("\n");
        System.out.println("Localizar Aluno");
        escola.buscaAluno(33465);

    }

}