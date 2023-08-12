package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    // Atributos
    private String nome;
    private List<Aluno> alunos;

    // Construtor
    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    //Métodos
    public void adicionaAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso");
    }

    public void exibeTodos(){
        for (Aluno aluno : alunos) {
            System.out.printf("\n");
            System.out.print(aluno);
        }
    }

    public void exibeAlunosGraduacao(){

        for(Aluno aluno: alunos){
            if(aluno instanceof AlunoGraduacao){
                System.out.println("\n");
                System.out.println(aluno);
            }
        }
    }


    public void exibeAprovado(){
        for(Aluno aluno: alunos){
            if(aluno.calculaMedia() >= 6){
                System.out.println(aluno);
            }
        }
    }

    public void buscaAluno(Integer ra){

    Integer contador = 0;

    for(Aluno aluno:alunos){
        if(aluno.getRa().equals(ra)){
             System.out.println(aluno);
            contador ++;
        }
    }

    if(contador == 0) {
        System.out.println("Não localizado");
    }

    }


    // ToString
    @Override
    public String toString() {
        return String.format("Nome Escola: %s, Aluno: %s", nome, alunos);
    }
}
