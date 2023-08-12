package org.example;

public class Servico implements Vendavel {

    //Atributos
    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;


    // Construtor
    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }


    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    //Método
    @Override
    public Double getValorVenda() {
        return quantHoras * valorHora;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("🛒 Serviço: Descricao %s, Codigo: %d, QuantidadeHoras: %d, ValorHora: %.2f, ValorDeVenda: %.2f",
                descricao, codigo, quantHoras, valorHora, getValorVenda());
    }
}
