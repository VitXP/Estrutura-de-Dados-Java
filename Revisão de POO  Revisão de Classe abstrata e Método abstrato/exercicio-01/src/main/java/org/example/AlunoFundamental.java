package org.example;

public class AlunoFundamental extends Aluno {

    // Atributos
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    // Construtor
    public AlunoFundamental(Integer ra, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Métodos
    @Override
    public Double calculaMedia() {
        return (nota1+nota2+nota3+nota4) /4;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("%s, Nota01: %.2f, Nota02: %.2f, Nota03: %.2f, Nota04: %.2f",
                super.toString(), nota1, nota2, nota3, nota4);
    }
}
