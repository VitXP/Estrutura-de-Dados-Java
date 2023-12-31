package org.example;

public class Livro extends Produto {

    //Atributos
    private String nome;
    private String autor;
    private String isbn;

    //Construtor
    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() + (getPrecoCusto() * 0.10);
    }

    //ToString
    @Override
    public String toString() {
        return String.format("%s || Livro: Nome: %s, Autor: %s, Isbn: %s",
                super.toString(), nome, autor, isbn);
    }
}
