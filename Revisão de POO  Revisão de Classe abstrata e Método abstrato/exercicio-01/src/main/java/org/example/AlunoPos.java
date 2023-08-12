package org.example;

public class AlunoPos extends Aluno {

    // Atributos
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    // Construtor
    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    // Métodos
    @Override
    public Double calculaMedia() {
        return (nota1 + nota2) / 2;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("%s, Nota01: %.2f, Nota02: %.2f, notaMonografia: %.2f", super.toString(), nota1, nota2, notaMonografia);
    }
}
