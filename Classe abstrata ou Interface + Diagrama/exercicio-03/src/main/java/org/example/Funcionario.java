package org.example;

public class Funcionario {

    // Atributos
    private String nome;

    // Construtor
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Get e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // ToString
    @Override
    public String toString() {
        return String.format("🏫 Funcionário: nome %s",
                nome);
    }

}
