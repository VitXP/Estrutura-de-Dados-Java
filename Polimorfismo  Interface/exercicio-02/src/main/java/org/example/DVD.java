package org.example;

public class DVD extends Produto {

    //Atributos
    private String nome;
    private String gravadora;

    //Construtor
    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }


    //Get e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    //Métodos
    @Override
    public Double getValorVenda() {
        return getPrecoCusto() + (getPrecoCusto() * 0.20);
    }

    //ToString
    @Override
    public String toString() {
        return String.format("%s || DVD: Nome: %s Gravadora: %s",
                super.toString(), nome, gravadora);

    }
}
