package org.example;

public class AlunoGraduacao extends Aluno {

    // Atributos
    private Double nota1;
    private Double nota2;

    // Construtor
    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Métodos
    @Override
    public Double calculaMedia() {
        return (nota1+nota2)/2;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("%s, Nota01: %.2f, Nota02: %.2f", super.toString(), nota1, nota2);
    }
}
