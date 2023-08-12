package org.example;

public abstract class Aluno {

    // Atributos
    private Integer ra;
    private String nome;

    // Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // Métodos
    public abstract Double calculaMedia();

    // Getter and Setter
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("Aluno | Ra: %s, Nome: %s", ra, nome);
    }
}
